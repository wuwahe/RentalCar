package com.qfedu.sys.mapper;

import com.qfedu.sys.domain.User;
import com.qfedu.sys.domain.UserVo;

public interface UserMapper {
    User login(UserVo userVo);
}
