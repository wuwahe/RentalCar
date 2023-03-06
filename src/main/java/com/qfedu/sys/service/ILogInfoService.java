package com.qfedu.sys.service;

import com.qfedu.sys.domain.LogInfoVo;
import com.qfedu.sys.utils.DataGridView;

/**
 * @Author:千锋强哥
 * @organization: 千锋教研院
 * @Version: 1.0
 */
public interface ILogInfoService {
    DataGridView queryAllLogInfo(LogInfoVo logInfoVo);

    void deleteLogInfo(Integer id);

    void deleteBatchLogInfo(LogInfoVo logInfoVo);
}
