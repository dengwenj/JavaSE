public class HomeWork01 {
  public static void main(String[] args) {
    Cale c = new Cale();
    System.out.println(c.demo1(1, 2));
    System.out.println(c.demo2(1, 2));
    System.out.println(c.demo3(1, 2));
    System.out.println(c.demo4(1, 0));

    System.out.println(c.yzc());

    Person p = new Person("邓文杰", 22, "男");
    p.show();

    Music m = new Music("长长的河流", 4.30);
    m.play();
    m.getInfo();
  }
}

class Music {
  String name;
  double times;

  Music(String name, double times) {
    this.name = name;
    this.times = times; 
  }

  public void play() {
    System.out.println("播放");
  }

  public void getInfo() {
    System.out.println(this.name);
    System.out.println(this.times);
  }
}

class Person {
  String name;
  int age;
  String sex;

  Person(String name, int age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  public void show() {
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.sex);
  }
}

class Cale {
  double num1;
  double num2;
  double bj = 1;

  public double yzc() {
    return 3.14 * this.bj * 2;
  }

  public double demo1(double num1, double num2) {
    return num1 + num2;
  }
  public double demo2(double num1, double num2) {
    return num1 - num2;
  }
  public double demo3(double num1, double num2) {
    return num1 * num2;
  }
  public Double demo4(double num1, double num2) {
    if(num2 == 0) {
      System.out.println("除数不能为0");
      return null;
    }
    return num1 / num2;
  }
}
