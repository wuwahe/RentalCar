package com.qfedu.bus.service;

import com.qfedu.bus.domain.Customer;
import com.qfedu.bus.vo.CustomerVo;
import com.qfedu.sys.utils.DataGridView;

public interface ICustomerService {

    DataGridView queryAllCustomer(CustomerVo customerVo);

    void addCustomer(CustomerVo customerVo);

    void deleteCustomer(String identity);

    void updateCustomer(CustomerVo customerVo);

    void deleteBatchCustomer(String ids[]);

    Customer queryCustomerByIdentity(String identity);
}

