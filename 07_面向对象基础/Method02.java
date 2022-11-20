public class Method02 {
  public static void main(String[] args) {
    A a = new A();
    // a.hh();
    a.xx();
  }
}

class A {
  public void print() {
    System.out.println("我是 A 类的 print 方法");
  }
  public void hh() {
    // 同一个类中的方法调用：直接调用即可。
    print();
    System.out.println("我是 A 类的 hh 方法");
  }

  public void xx() {
    System.out.println("我是 A 类的 xx 方法前面");
    B b = new B();
    b.bb();
    System.out.println("我是 A 类的 xx 方法后面");
  }
}

class B {
  public void bb() {
    System.out.println("我是 B 类的 bb 方法");
  }
}