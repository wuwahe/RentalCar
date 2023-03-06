package com.qfedu.stat.service.impl;

import com.qfedu.stat.domain.BaseEntity;
import com.qfedu.stat.mapper.StatMapper;
import com.qfedu.stat.service.IStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatService implements IStatService {

    @Autowired
    private StatMapper statMapper;

    @Override
    public List<BaseEntity> loadCustomerAreaStatList() {
        return statMapper.queryCustomerAreaStat();
    }

    @Override
    public List<Double> loadCompanyYearGradeStatList(String year) {
        return statMapper.queryCompanyYearGradeStat(year);
    }

    @Override
    public List<BaseEntity> loadOpernameYearGradeStatList(String year) {
        return statMapper.queryOpernameYearGradeStat(year);
    }
}
