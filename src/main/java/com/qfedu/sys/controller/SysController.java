package com.qfedu.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sys")
public class SysController {

    /*
    * 跳转到菜单管理页面
    * */
    @RequestMapping("toMenuManager")
    public String toMenuManger(){
        return "system/menu/menuManager";
    }

    /*
    * 跳转
    * */
    @RequestMapping("dTreeDemo")
    public String test(){
        return "system/menu/dTreeDemo";
    }
}
