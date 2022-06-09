package com.xinqi.mapper;

import com.xinqi.domain.Account;

import javax.annotation.Resources;
import java.util.List;

public interface AccountMapper {
    
    // 查询所有的账号
    public List<Account> selectAll();
 
    // 保存账号
    public void insert(Account account);
}