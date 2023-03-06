package com.qfedu.sys.service;

import com.qfedu.sys.domain.Menu;
import com.qfedu.sys.domain.MenuVo;
import com.qfedu.sys.utils.DataGridView;

import java.util.List;


public interface IMenuService {
    List<Menu> queryAllMenuForList(MenuVo menuVo);

    DataGridView queryAllMenu(MenuVo menuVo);

    void addMenu(MenuVo menuVo);

    void updateMenu(MenuVo menuVo);

    Integer queryMenuByPid(Integer id);

    void deleteMenu(MenuVo menuVo);
}
