package com.encap;

public class Test {
  public static void main(String[] args) {
    Account account = new Account("邓", "11");
    account.showInfo();

    Account account1 = new Account();
    account1.setName("讲客请求气客气");
    account1.setPassword("123456");
    account1.showInfo();
  }
}
