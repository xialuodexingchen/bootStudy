package com.example.study.service;

import com.example.study.model.Account;

import java.util.List;

public interface AccountService {

    int add(Account account);

    Account findAccountById(Long id);

    int update(Account account);

    int delete(Long id);

    List<Account> findAccountList();
}
