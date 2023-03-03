package com.qfedu.bus.controller;

import com.qfedu.bus.domain.Car;
import com.qfedu.bus.service.ICarService;
import com.qfedu.bus.vo.CarVo;
import com.qfedu.sys.constant.SysConstant;
import com.qfedu.sys.utils.AppFileUtils;
import com.qfedu.sys.utils.DataGridView;
import com.qfedu.sys.utils.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private ICarService carService;
    /*
    * 加载车辆列表 返回的是DataGridView
    * */
    @RequestMapping("loadAllCar")
    public DataGridView loadAllCar(CarVo carVo){
       return this.carService.queryAllCar(carVo);
    }
    /*
    * 添加车辆方法
    * */
    @PostMapping("addCar")
    public ResultObj addCar(CarVo carVo){
        try {
            carVo.setCreatetime(new Date());
            //如果不是默认图片就去掉图片的——temp的后缀
            if (!carVo.getCarimg().equals(SysConstant.DEFAULT_CAR_IMG)){
                String filePath = AppFileUtils.updateFileName(carVo.getCarimg(),SysConstant.FILE_UPLOAD_TEMP);
                carVo.setCarimg(filePath);
            }
            this.carService.addCAr(carVo);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.ADD_ERROR;
        }
    }

    /*
    * 删除车辆
    * */
    @RequestMapping("deleteCar")
    public ResultObj deleteCar(String carnumber){
        try {
            carService.deleteCar(carnumber);
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }

    /*
    * 更新车辆信息
    * */
    @PostMapping("updateCar")
    public ResultObj updateCar(CarVo carVo){
        try {
            String carimg = carVo.getCarimg();
            if (carimg.endsWith(SysConstant.FILE_UPLOAD_TEMP)) {
                String filePath = AppFileUtils.updateFileName(carVo.getCarimg(), SysConstant.FILE_UPLOAD_TEMP);
                carVo.setCarimg(filePath);
                //删除原来的图片
                Car car = carService.queryCarByCarNumber(carVo.getCarnumber());
                AppFileUtils.removeFileByPath(car.getCarimg());
            }
            //更新操作
            carService.updateCar(carVo);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.UPDATE_ERROR;
        }
    }

    /*
    * 批量删除车辆
    * */
    @PostMapping("deleteBatchCar")
    public ResultObj deleteBatchCar(CarVo carVo){
        try {
            carService.deleteBatchCar(carVo.getIds());
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return  ResultObj.DELETE_ERROR;
        }
    }
}
