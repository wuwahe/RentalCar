package com.qfedu.sys.mapper;

import com.qfedu.sys.domain.Menu;
import com.qfedu.sys.domain.MenuVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:千锋强哥
 * @organization: 千锋教研院
 * @Version: 1.0
 */
public interface MenuMapper {
    List<Menu> queryAllMenu(MenuVo menuVo);

    void insertSelective(MenuVo menuVo);

    void updateByPrimaryKeySelective(MenuVo menuVo);

    Integer queryMenuByPid(Integer pid);

    void deleteByPrimaryKey(Integer id);

    List<Menu> queryMenuByRoleId(@Param("available") Integer availableTrue, @Param("rid")Integer roleid);
}
