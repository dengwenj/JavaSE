// .java 源文件 .class 字节码文件
/**
  1、一个源文件中最多只能有一个 public 类，其他类的个数不限
  2、如果源文件包含一个 public 类，则文件名必须按该类名命名
  3、一个源文件中最多只能有一个 public 类，其他类的个数不限，
    也可以将 main 方法写在非 public类中，然后指定运行非 public 类，这样入口方法就是非 public 的 main 方法
 */
public class Hello {
  public static void main(String[] args) {
    System.out.println("你好");
  }
}

class Ww {
  public static void main(String[] args) {
    System.out.println("你好 Ww");
  }
}

class Dwj {
  public static void main(String[] args) {
    System.out.println("你好 邓文杰");
  }
}
