public class Constructor {
  public static void main(String[] ages) {
    Person p = new Person("邓文杰", 22);
    System.out.println(p.name);
    System.out.println(p.age);

    Person p1 = new Person("韩梅梅");
    System.out.println(p1.name);

    Person p2 = new Person();
  }
}

class Person {
  String name;
  int age;

  // 无参构造器
  Person() {
    System.out.println("无参构造器");
  }

  public Person(String pName, int pAge) {
    System.out.println("构造器执行了");
    name = pName;
    age = pAge;
  }

  public Person(String pName) {
    System.out.println("一个类可以定义多个不同的构造器，即构造器重载");
    name = pName;
  }
}
