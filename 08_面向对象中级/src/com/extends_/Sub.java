package com.extends_;

public class Sub extends Base {
  /**
   * 1、子类必须调用父类的构造器，完成父类的初始化
   * 2、当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，如果父类
   * 没有提供无参构造器，则必须在子类的构造器中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过
   * 3、如果希望指定去调用父类的某个构造器，则显式的调用一下：super(参数列表)
   * 4、super 在使用时，必须放在构造器第一行（super只能在构造器中使用）
   * 5、super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
   */
//  无惨构造器
  public Sub() {
    super("dengwenjie", 23);
    System.out.println("先调用父类在调用子类");
  }

  public Sub(String name) {
    super(); // 默认调用父类的无参构造器
    System.out.println("子类");
  }
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
