package com.qfedu.sys.service.impl;

import com.qfedu.sys.domain.User;
import com.qfedu.sys.domain.UserVo;
import com.qfedu.sys.mapper.UserMapper;
import com.qfedu.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;



    //用户登录的核心方法
    @Override
    public User login(UserVo userVo) {
        //根据用户名和密码查询
        //先uservo中输入的密码进行MD5加密操作
        String pwd = DigestUtils.md5DigestAsHex(userVo.getPwd().getBytes());
        userVo.setPwd(pwd);
        //调用userMapper接口的查询方法
        return userMapper.login(userVo);
    }
}
