package com.qfedu.bus.service;

import com.qfedu.bus.vo.CheckVo;
import com.qfedu.sys.utils.DataGridView;

import java.util.Map;

public interface ICheckService {
    Map<String, Object> initCheckFormData(String rentid);

    void addCheck(CheckVo checkVo);

    DataGridView queryAllCheck(CheckVo checkVo);

    void updateCheck(CheckVo checkVo);

    void deleteCheck(String checkid);

    void deleteBatchCheck(String[] ids);
}
