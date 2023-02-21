package com.qfedu.sys.service.impl;

import com.qfedu.sys.mapper.AccountMapper;
import com.qfedu.sys.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional//事务控制
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountMapper mapper;
    @Override
    public int updateTransfer(String inName, String outName, double money) {
        try {
            mapper.transferIn(inName,money);
            mapper.transferOut(outName,money);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }



    }
}
