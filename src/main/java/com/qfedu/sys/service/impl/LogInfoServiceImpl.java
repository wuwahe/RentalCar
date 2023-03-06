package com.qfedu.sys.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.sys.domain.LogInfo;
import com.qfedu.sys.domain.LogInfoVo;
import com.qfedu.sys.mapper.LogInfoMapper;
import com.qfedu.sys.service.ILogInfoService;
import com.qfedu.sys.utils.DataGridView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:千锋强哥
 * @organization: 千锋教研院
 * @Version: 1.0
 */
@Service
public class LogInfoServiceImpl implements ILogInfoService {

    @Autowired
    private LogInfoMapper logInfoMapper;

    /**
     * 分页查询日志
     * @param logInfoVo
     * @return
     */
    @Override
    public DataGridView queryAllLogInfo(LogInfoVo logInfoVo) {
        Page<LogInfo> page = PageHelper.startPage(logInfoVo.getPage(),logInfoVo.getLimit());
        List<LogInfo> data =  logInfoMapper.queryAllLogInfo(logInfoVo);
        return new DataGridView(page.getTotal(),data);
    }

    @Override
    public void deleteLogInfo(Integer id) {
        logInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteBatchLogInfo(LogInfoVo logInfoVo) {
        for (Integer id : logInfoVo.getIds()) {
            deleteLogInfo(id);
        }
    }
}
