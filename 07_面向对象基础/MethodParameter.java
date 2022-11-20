public class MethodParameter {
  public static void main(String[] args) {
    AA a = new AA();
    
    Person p = new Person();
    p.name = "dengwenj";
    p.age = 22;

    a.test(p);
    System.out.println(p.age); // 23
  }
}

class Person {
  String name;
  int age;
}

class AA {
  // 形参传递的是对象
  // 引用类型传递的是地址（传递也是值，但是值是地址），可以通过形参影响实参
  public void test(Person p) {
    p.age = 23;
  }
}
