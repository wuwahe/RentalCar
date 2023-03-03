package com.qfedu.bus.mapper;

import com.qfedu.bus.domain.Car;
import com.qfedu.bus.vo.CarVo;

import java.util.List;

public interface CarMapper {
    List<Car> queryAllCar(CarVo carVo);

    void insertSelective(CarVo carVo);

    Car selectByPrimayKey(String carnumber);

    void deleteByPrimaryKey(String carnumber);

    void updateByPrimarykeySelective(CarVo carVo);
}
