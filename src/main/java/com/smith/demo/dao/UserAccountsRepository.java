package com.smith.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smith.demo.entitis.UserAccounts;

@Repository
public interface UserAccountsRepository extends CrudRepository<UserAccounts, Long>{

}
