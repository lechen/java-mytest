package com.le.base.reflect;

public class Stu2 {
  private int id;
  private String stuName;
  private boolean sex;
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
   * @return the stuName
   */
  public String getStuName() {
    return stuName;
  }
  /**
   * @param stuName the stuName to set
   */
  public void setStuName(String stuName) {
    this.stuName = stuName;
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
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Stu2 [id=" + id + ", stuName=" + stuName + ", sex=" + sex + "]";
  }
  
}
