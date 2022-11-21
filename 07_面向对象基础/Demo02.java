public class Demo02 {
  public static void main(String[] args) {
    Person p = new Person();
    p.name = "dengwenj";
    p.age = 22;
    p.sex = "男";

    Test t = new Test();
    Person p1 = t.copePerson(p);
    System.out.println(p1.name);
    System.out.println(p1.age);
    System.out.println(p1.sex);
    System.out.println(p.name);
  } 
}

class Person {
  String name;
  int age;
  String sex;
}

class Test {
  public Person copePerson(Person p) {
    Person p1 = new Person();
    p1.name = p.name;
    p1.age = p.age;
    p1.sex = p.sex;

    p.name = "hmm";
    
    return p1;
  }
}
