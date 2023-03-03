package com.qfedu.bus.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.bus.domain.Car;
import com.qfedu.bus.mapper.CarMapper;
import com.qfedu.bus.service.ICarService;
import com.qfedu.bus.vo.CarVo;
import com.qfedu.sys.constant.SysConstant;
import com.qfedu.sys.utils.AppFileUtils;
import com.qfedu.sys.utils.DataGridView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    private CarMapper carMapper;
    @Override
    public DataGridView queryAllCar(CarVo carVo) {
        //使用PageHelperd分页查询
        Page<Car> page = PageHelper.startPage(carVo.getPage(), carVo.getLimit());
        List<Car> data = carMapper.queryAllCar(carVo);
        return new DataGridView(page.getTotal(),data);
    }

    @Override
    public void addCAr(CarVo carVo) {
        this.carMapper.insertSelective(carVo);
    }

    /*
    * 删除车的方法
    * */
    @Override
    public void deleteCar(String carnumber) {
        //先删除图片
        Car car = carMapper.selectByPrimayKey(carnumber);
        //如果不是默认图片，就进行删除
        if (!car.getCarimg().equals(SysConstant.DEFAULT_CAR_IMG)){
            AppFileUtils.deleteFileUsePath(car.getCarimg());
        }
        //删除数据库数据
        carMapper.deleteByPrimaryKey(carnumber);
    }

    @Override
    public Car queryCarByCarNumber(String carnumber) {
        return carMapper.selectByPrimayKey(carnumber);
    }

    @Override
    public void updateCar(CarVo carVo) {
        carMapper.updateByPrimarykeySelective(carVo);
    }

    @Override
    public void deleteBatchCar(String[] ids) {
        for (String carnumber:ids){
            this.deleteCar(carnumber);
        }
    }
}
