package com.xinqi.controller;

import com.xinqi.domain.Account;
import com.xinqi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/select")
    @ResponseBody
    public String selectAllAccount(){
        List<Account> accounts = accountService.queryAll();
        String s = accounts.toString();
        return s;
    }

    @RequestMapping("/save")
    @ResponseBody
    public String saveAccount(){
        Account account = new Account();
        account.setName("你好");
        accountService.save(account);
        return "成功";
    }

}
