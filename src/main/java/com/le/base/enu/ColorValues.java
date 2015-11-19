package com.le.base.enu;

public enum ColorValues {
  BLUE("蓝色"), YELLOW("黄色"), RED("红色"), GREEN("绿色"), WHITE("白色"), BRACK("黑色"), PURPLE(
      "紫色");
  private String description;
  
  private ColorValues(String description) {
    this.description = description;
  }
  
  public String getDescription() {
    return description;
  }
}
