package com.le.ssm.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.le.ssm.service.MailServiceImpl;

@Controller
@RequestMapping("/mail")
public class MailController {
  private static final Log log = LogFactory.getLog(MailController.class);

  @Autowired
  private MailServiceImpl mailService;

  @RequestMapping(value = "/send", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
  public @ResponseBody String send(@RequestParam("content") String content) throws Exception {
      return "hello";
  }
}
