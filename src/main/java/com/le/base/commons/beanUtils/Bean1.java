package com.le.base.commons.beanUtils;

import java.util.Date;

public class Bean1 {
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
	@Override
	public String toString() {
		return "Bean1 [age=" + age + ", name=" + name + ", birthday="
				+ birthday + "]";
	}
	
}
