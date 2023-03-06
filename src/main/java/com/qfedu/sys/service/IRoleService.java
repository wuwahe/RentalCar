package com.qfedu.sys.service;

import com.qfedu.sys.domain.RoleVo;
import com.qfedu.sys.utils.DataGridView;

public interface IRoleService {
    DataGridView queryAllRole(RoleVo roleVo);

    void addRole(RoleVo roleVo);

    void updateRole(RoleVo roleVo);

    void deleteRole(Integer roleid);

    void deleteBatchRole(Integer[] ids);

    DataGridView initRoleMenuTreeJson(Integer roleid);

    void saveRoleMenu(RoleVo roleVo);
}
