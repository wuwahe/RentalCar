package com.qfedu.bus.service;

import com.qfedu.bus.domain.Car;
import com.qfedu.bus.vo.CarVo;
import com.qfedu.sys.utils.DataGridView;

public interface ICarService {
    DataGridView queryAllCar(CarVo carVo);

    void addCAr(CarVo carVo);

    void deleteCar(String carnumber);

    Car queryCarByCarNumber(String carnumber);

    void updateCar(CarVo carVo);

    void deleteBatchCar(String[] ids);
}
