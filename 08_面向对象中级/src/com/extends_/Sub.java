package com.extends_;

public class Sub extends Base {
  /**
   * 1、子类继承了所有的属性和方法，非私有的属性和方法可以在子类直接访问，
   * 但是私有属性和方法不能在子类直接访问，要通过父类提供公共的方法去访问。
   */
  public void ww() {
    System.out.println(n1 + " " + n3 + " " + n3);
  }

  public void hmm() {
    System.out.println(getN4());
    test1();
    test2();
    test3();
    test5();
  }
}
