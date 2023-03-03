package com.qfedu.bus.service;

import com.qfedu.bus.domain.Rent;
import com.qfedu.bus.vo.RentVo;
import com.qfedu.sys.utils.DataGridView;

public interface IRentService {
    void addRent(RentVo rentVo);

    DataGridView queryAllRent(RentVo rentVo);

    void updateRent(RentVo rentVo);

    void deleteRent(RentVo rentVo);

    Rent queryRentById(String rentid);
}
