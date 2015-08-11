package com.le.ssm.entities;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private int id;
  private String userName;
  private boolean sex;
  private Date  birthday;
  /**
   * @return the id
   */
  public int getId() {
    return id;
  }
  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return the sex
   */
  public boolean isSex() {
    return sex;
  }
  /**
   * @param sex the sex to set
   */
  public void setSex(boolean sex) {
    this.sex = sex;
  }
  /**
   * @return the birthday
   */
  public Date getBirthday() {
    return birthday;
  }
  /**
   * @param birthday the birthday to set
   */
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
  /**
   * @return the userName
   */
  public String getUserName() {
    return userName;
  }
  /**
   * @param userName the userName to set
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "User [id=" + id + ", userName=" + userName + ", sex=" + sex + ", birthday=" + birthday
        + "]";
  }
  
}
