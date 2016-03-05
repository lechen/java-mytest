package com.le.base.commons.beanUtils;

import java.io.Serializable;
import java.util.Date;

public class Bean1 implements Serializable{
	/**
   * 
   */
  private static final long serialVersionUID = 1L;
  private int age;
	private String name;
	private Date birthday;
	private Bean2 bean2;
	
	/**
   * @return the bean2
   */
  public Bean2 getBean2() {
    return bean2;
  }
  /**
   * @param bean2 the bean2 to set
   */
  public void setBean2(Bean2 bean2) {
    this.bean2 = bean2;
  }
  public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Bean1 [age=" + age + ", name=" + name + ", birthday=" + birthday + ", bean2=" + bean2
        + "]";
  }
	
}
