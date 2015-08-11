package com.le.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.le.ssm.dao.UserDao;
import com.le.ssm.entities.User;
import com.le.ssm.service.UserService;

public class UserServiceImpl implements UserService{
  
  @Autowired
  private UserDao userDao;
  
  public List<User> selectAll() {
    return userDao.selectAll();
  }

}
