package com.le.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.le.ssm.dao.UserDao;
import com.le.ssm.entities.User;
import com.le.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService{
  
//  @Autowired
//  private UserDao userDao;
  
  public List<User> selectAll() {
//    userDao.selectAll();
    return null;
  }

}
