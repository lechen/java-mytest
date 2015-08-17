package com.le.ssm.common.properties;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * code属性文件
 * @author LE
 *
 */
@Component
public class CodeProp {
//  private static final Logger logger = Logger.getLogger(CodeProp.class);
  private static Map<String,String> codeMsgMap = new ConcurrentHashMap<String, String>();
  private static final Object obj = new Object();
  
  @Value("${normal}")
  public String normal;
  
  @Value("${syserror}")
  public String sysError;
  
  @Value("${msg_normal}")
  public String msgNormal;
  
  @Value("${msg_syserror}")
  public String msgSysError;
  
  /**
   * 根据指定的code获取信息
   * @param code
   * @return
   */
  public String getMsg(String code){
      String msg = codeMsgMap.get(code);
      if(StringUtils.isBlank(msg)){
          synchronized (obj) {
              msg = codeMsgMap.get(code);
              if(StringUtils.isBlank(msg)){
                  Field[] fields =CodeProp.class.getDeclaredFields(); 
                  if(fields!=null && fields.length>0){
                      for(Field field : fields){
                          try {
                              String value = (String) field.get(this);
                              if(StringUtils.isNotBlank(value) && value.startsWith(code)){
                                  msg = value.substring(code.length()+1);
                                  break;
                              }
                          } catch (Exception e) {
//                              logger.error(e);
                            System.out.println(e);
                          }
                      }
                  }
                  if(StringUtils.isNotBlank(msg)){
                      codeMsgMap.put(code, msg);
                  }
              }
          }
      }
      if(StringUtils.isBlank(msg)){
          msg = StringUtils.EMPTY;
      }
      return msg;
  }
}
