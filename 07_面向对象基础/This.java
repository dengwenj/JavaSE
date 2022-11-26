public class This {
  public static void main(String[] args) {
    Person p = new Person("等你文件", 23);
    System.out.println(p.name);
    System.out.println(p.name);
    System.out.println(p.hashCode());

    Person p1 = new Person();
    p1.f1();
  }
}

class Person {
  String name;
  int age = 22;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("this.hashCode()" + this.hashCode());
  }

  public Person() {
    this("韩梅梅", "王小波");
    System.out.println("this() 只能在第一句使用");
  }

  public Person(String name1, String name2) {
    System.out.println(name1 + name2);
  }

  public void f() {
    System.out.println(this.name + " f方法"); // null
  }

  public void f1() {
    this.f();
  }
}
