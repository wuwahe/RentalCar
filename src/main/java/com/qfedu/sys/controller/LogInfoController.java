package com.qfedu.sys.controller;

import com.qfedu.sys.domain.LogInfoVo;
import com.qfedu.sys.service.ILogInfoService;
import com.qfedu.sys.utils.DataGridView;
import com.qfedu.sys.utils.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:千锋强哥
 * @organization: 千锋教研院
 * @Version: 1.0
 */
@RestController
@RequestMapping("logInfo")
public class LogInfoController {

    @Autowired
    private ILogInfoService logInfoService;

    /**
     * 分页查询加载日志信息
     */
    @RequestMapping("loadAllLogInfo")
    public DataGridView loadAllLogInfo(LogInfoVo logInfoVo){
        return logInfoService.queryAllLogInfo(logInfoVo);
    }

    /**
     * 删除日志
     */
    @RequestMapping("deleteLogInfo")
    public ResultObj deleteLogInfo(Integer id){
        try {
            logInfoService.deleteLogInfo(id);
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }

    /**
     * 批量删除日志
     */
    @RequestMapping("deleteBatchLogInfo")
    public ResultObj deleteBatchLogInfo(LogInfoVo logInfoVo){
        try {
            logInfoService.deleteBatchLogInfo(logInfoVo);
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }
}
