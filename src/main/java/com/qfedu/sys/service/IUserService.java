package com.qfedu.sys.service;

import com.qfedu.sys.domain.User;
import com.qfedu.sys.domain.UserVo;
import com.qfedu.sys.utils.DataGridView;

public interface IUserService {
    User login(UserVo userVo);

    DataGridView queryAllUser(UserVo userVo);

    void addUser(UserVo userVo);

    void updateUser(UserVo userVo);

    void deleteUser(Integer userid);

    void deleteBatchUser(UserVo userVo);

    void resetUserPwd(Integer userid);

    DataGridView queryUserRole(Integer userid);

    void saveUserRole(UserVo userVo);
}
