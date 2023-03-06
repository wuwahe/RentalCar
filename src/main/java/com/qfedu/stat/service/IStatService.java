package com.qfedu.stat.service;

import com.qfedu.stat.domain.BaseEntity;

import java.util.List;

public interface IStatService {
    List<BaseEntity> loadCustomerAreaStatList();

    List<Double> loadCompanyYearGradeStatList(String year);

    List<BaseEntity> loadOpernameYearGradeStatList(String year);
}
