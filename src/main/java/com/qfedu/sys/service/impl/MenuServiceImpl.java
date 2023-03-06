package com.qfedu.sys.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.sys.domain.Menu;
import com.qfedu.sys.domain.MenuVo;
import com.qfedu.sys.mapper.MenuMapper;
import com.qfedu.sys.service.IMenuService;
import com.qfedu.sys.utils.DataGridView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> queryAllMenuForList(MenuVo menuVo) {
        return menuMapper.queryAllMenu(menuVo);
    }

    @Override
    public DataGridView queryAllMenu(MenuVo menuVo) {
        //分页查询
        Page<Object> page = PageHelper.startPage(menuVo.getPage(), menuVo.getLimit());
        List<Menu> menus = menuMapper.queryAllMenu(menuVo);
        return new DataGridView(page.getTotal(),menus);
    }

    @Override
    public void addMenu(MenuVo menuVo) {
        menuMapper.insertSelective(menuVo);
    }

    @Override
    public void updateMenu(MenuVo menuVo) {
        menuMapper.updateByPrimaryKeySelective(menuVo);
    }

    @Override
    public Integer queryMenuByPid(Integer pid) {

        return menuMapper.queryMenuByPid(pid);
    }

    @Override
    public void deleteMenu(MenuVo menuVo) {
        menuMapper.deleteByPrimaryKey(menuVo.getId());
    }
}
