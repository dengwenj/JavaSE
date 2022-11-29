package com.hanmeimei;

import com.dengwenjie.A;

public class Test {
  public void t() {
    A a = new A();
//    在不同包下，可以访问 public 修饰的属性或方法，但是不能访问 protected，默认，private修饰的属性或方法
    System.out.println("n1=" + a.n1);
  }
}
