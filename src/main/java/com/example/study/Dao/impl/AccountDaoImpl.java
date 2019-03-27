package com.example.study.Dao.impl;

import com.example.study.Dao.AccountDao;
import com.example.study.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
//import org.springframework.util.CollectionUtils;
//import org.springframework.util.CollectionUtils;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * @program: bootStudy
 * @description:
 * @author: linxiaojiu
 * @create: 2019/3/27
 **/
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int add(Account account) {
        return jdbcTemplate.update("insert into account(name,money) values (?,?)",account.getName(),account.getMoney());
    }

    @Override
    public Account findAccountById(Long id) {
        List<Account> list= jdbcTemplate.query("select * from account where id = ?",new Object[]{id},new BeanPropertyRowMapper<>(Account.class));
        if(org.springframework.util.CollectionUtils.isEmpty(list)){
            return null;
        }else{
            return list.get(0);
        }
    }

    @Override
    public int update(Account account) {
        return jdbcTemplate.update("update acount set name = ?,money = ? where id = ?",account.getName(),account.getMoney(),account.getId());
    }

    @Override
    public int delete(Long id) {
        return jdbcTemplate.update("delete from account where id = ?",id);
    }

    @Override
    public List<Account> findAccountList() {
        List<Account> list = jdbcTemplate.query("select * from account",new Object[]{},new BeanPropertyRowMapper<Account>(Account.class));

        return list;
    }
}
