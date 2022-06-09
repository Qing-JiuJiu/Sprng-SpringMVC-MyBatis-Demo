package com.xinqi.service.impl;

import com.xinqi.domain.Account;
import com.xinqi.mapper.AccountMapper;
import com.xinqi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    // 查询全部账号
    @Override
    public List<Account> queryAll() {
        List<Account> accounts = accountMapper.selectAll();
        System.out.println("查询全部账号");
        return accounts;
    }

    // 保存账号
    @Override
    public boolean save(Account account) {
        accountMapper.insert(account);
        System.out.println("保存账号");
        return true;
    }
}
