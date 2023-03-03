package com.qfedu.bus.mapper;

import com.qfedu.bus.domain.Check;
import com.qfedu.bus.vo.CheckVo;

import java.util.List;

public interface CheckMapper {
    void insertSelective(CheckVo checkVo);

    List<Check> queryAllCheck(CheckVo checkVo);

    void updateCheckByPrimary(CheckVo checkVo);

    void deleteByPrimaryKey(String checkid);
}
