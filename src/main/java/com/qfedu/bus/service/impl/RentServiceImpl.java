package com.qfedu.bus.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.bus.domain.Car;
import com.qfedu.bus.domain.Rent;
import com.qfedu.bus.mapper.CarMapper;
import com.qfedu.bus.mapper.RentMapper;
import com.qfedu.bus.service.IRentService;
import com.qfedu.bus.vo.CarVo;
import com.qfedu.bus.vo.RentVo;
import com.qfedu.sys.constant.SysConstant;
import com.qfedu.sys.utils.DataGridView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentServiceImpl implements IRentService {

    @Autowired
    private RentMapper rentMapper;

    @Autowired
    private CarMapper carMapper;
    @Override
    public void addRent(RentVo rentVo) {
        this.rentMapper.insertSelective(rentVo);
        //更改车辆的出租信息
        CarVo vo = new CarVo();
        vo.setCarnumber(rentVo.getCarnumber());
        //设置车辆为已出租
        vo.setIsrenting(SysConstant.RENT_BACK_TRUE);
        carMapper.updateByPrimarykeySelective(vo);
    }

    /*
    * 分页查询出租单
    * */
    @Override
    public DataGridView queryAllRent(RentVo rentVo) {
        Page<Rent> page = PageHelper.startPage(rentVo.getPage(), rentVo.getLimit());
        //做全查询
        List<Rent> data = rentMapper.queryAllRent(rentVo);
        return new DataGridView(page.getTotal(),data);

    }

    @Override
    public void updateRent(RentVo rentVo) {
        rentMapper.updateByPrimaryKeySelective(rentVo);
    }

    @Override
    public void deleteRent(RentVo rentVo) {
        CarVo carVo = new CarVo();
        carVo.setCarnumber(rentVo.getCarnumber());
        carVo.setIsrenting(SysConstant.RENT_CAR_FALSE); //车辆为出租状态
        //删除出租单
        rentMapper.deleteByPrimaryKey(rentVo.getRentid());
        //更新车辆的状态
        carMapper.updateByPrimarykeySelective(carVo);
    }

    @Override
    public Rent queryRentById(String rentid) {
        return rentMapper.queryRentById(rentid);
    }


}
