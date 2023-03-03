package com.qfedu.bus.controller;

import com.qfedu.bus.domain.Rent;
import com.qfedu.bus.service.ICheckService;
import com.qfedu.bus.service.IRentService;
import com.qfedu.bus.vo.CheckVo;
import com.qfedu.sys.utils.DataGridView;
import com.qfedu.sys.utils.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("check")
public class CheckController {

    @Autowired
    private IRentService rentService;

    @Autowired
    private ICheckService checkService;

    @PostMapping("checkRentExist")
    public Rent checkRentExist(String rentid){
        //出租单号不存在，返回一null，如果存在，返回的是一个rent对象
        return rentService.queryRentById(rentid);
    }

    /*
    * 根据出租单号加载检查单信息
    * */
    @PostMapping("initCheckFormData")
    public Map<String,Object> initCheckFormData(String rentid){
        return this.checkService.initCheckFormData(rentid);
    }

    /*
     * 保存检查单
     * */
    @PostMapping("saveCheck")
    public ResultObj initCheckFormData(CheckVo checkVo){
        try {
            checkVo.setCreatetime(new Date());
            checkService.addCheck(checkVo);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.ADD_ERROR;
        }
    }

    /*
    * 分页查询检查单
    * */
    @RequestMapping("loadAllCheck")
    public DataGridView loadAllCheck(CheckVo checkVo){
        return checkService.queryAllCheck(checkVo);
    }

    /*
    * 更新检查单
    * */
    @PostMapping("updateCheck")
    public ResultObj updateCheck(CheckVo checkVo){
        try {
            checkService.updateCheck(checkVo);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.UPDATE_ERROR;
        }
    }

    /*
    * 删除检查单
    * */
    @RequestMapping("deleteCheck")
    public ResultObj deleteCheck(String checkid){
        try {
            checkService.deleteCheck(checkid);
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }

    /*
    * 批量删除检查单
    * */
    @RequestMapping("deleteBatchCheck")
    public ResultObj deleteBatchCheck(CheckVo checkVo){
        try {
            checkService.deleteBatchCheck(checkVo.getIds());
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }
}
