package com.le.base.commons.beanUtils;

import java.io.Serializable;
import java.util.Date;

public class Bean2 implements Serializable{
	/**
   * 
   */
  private static final long serialVersionUID = 1L;
  private int age;
	private String name;
	private Date birthday;
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
    return "Bean2 [age=" + age + ", name=" + name + ", birthday=" + birthday + "]";
  }
	
}
