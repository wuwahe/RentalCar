package com.qfedu.bus.mapper;

import com.qfedu.bus.domain.Customer;
import com.qfedu.bus.vo.CustomerVo;

import java.util.List;

public interface CustomerMapper {


    List<Customer> queryAllCustomer(CustomerVo customerVo);

    void insertSelective(CustomerVo customerVo);

    void deletCustomer(String identity);

    void updateCustomer(CustomerVo customerVo);

    Customer selectByPrimaryKey(String identity);
}
