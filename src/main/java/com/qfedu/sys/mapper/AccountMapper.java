package com.qfedu.sys.mapper;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    //转入
    void transferIn(@Param("name")String name,@Param("money")double money);

    //转出
    void transferOut(@Param("name")String name,@Param("money")double money);
}
