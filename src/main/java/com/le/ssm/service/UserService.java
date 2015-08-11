package com.le.ssm.service;

import java.util.List;

import com.le.ssm.entities.User;

public interface UserService {
  public List<User> selectAll();
}
