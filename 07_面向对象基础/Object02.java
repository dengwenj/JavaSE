public class Object02 {
  public static void main(String[] args) {
    // cat1 是对象名（对象引用）
    // new Cat(); 创建的对象空间（数据）才是真正的对象
    Cat cat1 = new Cat();

    // null 0 null false
    System.out.println("猫的信息: " + cat1.name + cat1.age + cat1.color + cat1.flag);
  }
}

class Cat {
  String name; // 属性，成员变量，字段
  int age;
  String color;
  boolean flag;
}
