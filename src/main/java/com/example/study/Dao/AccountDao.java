package com.example.study.Dao;

import com.example.study.model.Account;

import java.util.List;

/**
 * @program: bootStudy
 * @description:
 * @author: linxiaojiu
 * @create: 2019/3/27
 **/
public interface AccountDao {

    int add(Account account);

    Account findAccountById(Long id);

    int update(Account account);

    int delete(Long id);

    List<Account> findAccountList();
}
