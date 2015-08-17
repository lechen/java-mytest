package com.le.ssm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.le.ssm.common.properties.CodeProp;
import com.le.ssm.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
  
  @Autowired
  private UserService userService;
  
  @Autowired
  private CodeProp codeProp;
  
  @RequestMapping(value = "all", method = RequestMethod.GET)
  @ResponseBody
  public String getAll(){
//    userService.selectAll().toString() 
    return codeProp.normal + " : " + codeProp.getMsg(codeProp.normal);
  }
}
