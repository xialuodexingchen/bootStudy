package com.example.study.impl;

import com.example.study.Dao.AccountDao;
import com.example.study.model.Account;
import com.example.study.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: bootStudy
 * @description:
 * @author: linxiaojiu
 * @create: 2019/3/27
 **/
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public int add(Account account) {
        return accountDao.add(account);
    }

    @Override
    public Account findAccountById(Long id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public int update(Account account) {
        return accountDao.update(account);
    }

    @Override
    public int delete(Long id) {
        return accountDao.delete(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDao.findAccountList();
    }
}
