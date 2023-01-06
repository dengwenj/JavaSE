package com.extends_;

public class Base {
  public int n1 = 100;
  protected int n2 = 200;
  int n3 = 300;
  private int n4 = 400;

  // 无惨构造器
  public Base() {
    System.out.println("我是父类的无惨构造器");
  }
//  有参构造器
  public Base(String name, int age) {
    System.out.println("姓名" + name + "年龄" + age);
  }

  public int getN4() {
    return n4;
  }

  public void test1() {
    System.out.println("test1");
  }

  protected void test2() {
    System.out.println("test2");
  }

  void test3() {
    System.out.println("test3");
  }

  private void test4() {
    System.out.println("test4");
  }

  public void test5() {
    test4();
  }
}
