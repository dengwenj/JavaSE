package com.dengwenjie;

public class A {
  public int n1 = 100;
  protected int n2 = 200;
  int n3 = 300;
  private int n4 = 400;

  public void test() {
    // 在同一类中，可以访问 public protected 默认 private 修饰属性和方法
    System.out.println("n1=" + n1 + " n2=" + n2 + " n3=" + n3 + " n4=" + n4);
  }
}
