public class HomeWork02 {
  public static void main(String[] args) {
    Demo d = new Demo();
    d.test();

    Demo2 d1 = new Demo2("邓文杰", "男", 22);
    Demo2 d2 = new Demo2("韩梅梅", "女");
    Demo2 d3 = new Demo2("王小波");
  }
}

class Demo {
  public void test() {
    System.out.println(method(method(1.1, 2.3, 3.4, 4.5), 10));
  }
  public double method(double num1, double num2) {
    return num1 + num2;
  }
  public double method(double num1, double num2, double num3, double num4) {
    return num1 + num2 + num3 + num4;
  }
}

class Demo2 {
  String name;
  String sex;
  int age;

  Demo2(String name, String sex, int age) {
    // this.name = name;
    // this.age = age;
    // this.sex = sex;
    this(name, sex); // 复用，调用构造器
    this.age = age;

    System.out.println(this.name);
    System.out.println(this.sex);
    System.out.println(this.age);
  }

  Demo2(String name, String sex) {
    this.name = name;
    this.sex = sex;

    System.out.println(this.name);
    System.out.println(this.sex);
  }

  Demo2(String name) {
    this.name = name;

    System.out.println(this.name);
    System.out.println(this.age); // 0

  }
}
