public class ThisDemo {
  public static void main(String[] args) {
    Person p = new Person("邓文杰", 22);
    Person p1 = new Person("韩梅梅", 20);
    System.out.println(p.demo(p1));
  }
}

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public boolean demo(Person p) {
    return this.name.equals(p.name) && this.age == p.age;
  }
}