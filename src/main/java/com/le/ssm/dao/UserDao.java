package com.le.ssm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.le.ssm.entities.User;

@Component
public class UserDao {
//  extends SqlSessionDaoSupport
//  @Autowired
//  public void setMySqlSessionFactory(
//      @Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
//    this.setSqlSessionFactory(sqlSessionFactory);
//  }
  
  public List<User> selectAll(){
//    List<User> userList = this.getSqlSession().selectList("selectAll");
    return null; 
  }
}
