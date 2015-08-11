package com.le.ssm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.le.ssm.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
  
  @Autowired
  private UserService userService;
  
  @RequestMapping(value = "all", method = RequestMethod.GET)
  @ResponseBody
  public String getAll(){
    return userService.selectAll().toString();
  }
}
