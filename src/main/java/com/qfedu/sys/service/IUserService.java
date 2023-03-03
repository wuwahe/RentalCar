package com.qfedu.sys.service;

import com.qfedu.sys.domain.User;
import com.qfedu.sys.domain.UserVo;

public interface IUserService {
    User login(UserVo userVo);
}
