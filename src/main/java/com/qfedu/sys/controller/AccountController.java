package com.qfedu.sys.controller;

import com.qfedu.sys.service.IAccountService;
import com.qfedu.sys.utils.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService service;
    @RequestMapping("transfer")
    @ResponseBody
    @Transactional
    public ResultObj accountTran(String inName,String outName,double money){
        int i = service.updateTransfer(inName, outName, money);
        if (i > 0) {
            return ResultObj.STATUS_TRUE;
        }else {
            return ResultObj.STATUS_FALSE;
        }
    }
}
