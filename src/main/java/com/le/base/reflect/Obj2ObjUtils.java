package com.le.base.reflect;

import java.lang.reflect.Field;

public class Obj2ObjUtils{
  private Obj2ObjUtils(){}
  
  public static Obj2ObjUtils getInstance(){
    return new Obj2ObjUtils(); 
  }
  

  /**
   * 按照属性名匹配 转换 对象
   * @param source  源对象
   * @param target  目标对象
   * @return    转换后的目标对象
   * @throws IllegalArgumentException
   * @throws IllegalAccessException
   */
  public Object convert(Object source, Object target) throws IllegalArgumentException, IllegalAccessException{
    if (source == null || target == null) {
      return null;
    }
    Field[] sourceFields = source.getClass().getDeclaredFields();  
    Field[] targetFields = target.getClass().getDeclaredFields(); 
    for (Field targetField : targetFields) {
      targetField.setAccessible(true);  
      for (Field sourceField : sourceFields) {  
        sourceField.setAccessible(true);  
        //过滤内容为空的  
        if (sourceField.get(source) == null) {  
            continue;  
        }  
        if (targetField.getName().equals(sourceField.getName())) {
          targetField.set(target, sourceField.get(source));
        }
      }  
    }
    return target;
  }
}
