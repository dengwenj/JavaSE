package com.encap;

public class Account {
  private String name;
  private String password;

  public Account() {
  }

  public Account(String name, String password) {
//    this.name = name;
//    this.password = password;
    this.setName(name);
    this.setPassword(password);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name.length() <= 6) {
      this.name = name;
      return;
    }

    this.name = "无名";
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    if (password.length() == 6) {
      this.password = password;
      return;
    }
    this.password = "000000";
  }

  public void showInfo() {
    System.out.println(this.name + this.password);
  }
}
