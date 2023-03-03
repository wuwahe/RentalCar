package com.qfedu.bus.mapper;

import com.qfedu.bus.domain.Rent;
import com.qfedu.bus.vo.RentVo;

import java.util.List;

public interface RentMapper {
    void insertSelective(RentVo rentVo);

    List<Rent> queryAllRent(RentVo rentVo);

    void updateByPrimaryKeySelective(RentVo rentVo);

    void deleteByPrimaryKey(String rentid);

    Rent queryRentById(String rentid);

}
