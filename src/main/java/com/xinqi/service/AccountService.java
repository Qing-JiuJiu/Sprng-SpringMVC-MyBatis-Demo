package com.xinqi.service;

import com.xinqi.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {

    // 查询所有账号
    public List<Account> queryAll();

    // 保存账号
    public boolean save(Account account);
}