package com.qfedu.sys.mapper;

import com.qfedu.sys.domain.LogInfo;
import com.qfedu.sys.domain.LogInfoVo;

import java.util.List;

/**
 * @Author:千锋强哥
 * @organization: 千锋教研院
 * @Version: 1.0
 */
public interface LogInfoMapper {
    List<LogInfo> queryAllLogInfo(LogInfoVo logInfoVo);

    void deleteByPrimaryKey(Integer id);
}
