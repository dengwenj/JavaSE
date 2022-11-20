**类与对象**

```java
public class Object01 {
  public static void main(String[] args) {
    // oop 面向对象，核心就是类与对象
    // 类是抽象的，概念的，代表一类事物，比如：人类，猫类
    // 对象是具体的，实际的，代表一个具体事物，即实例
    // 类是对象的模板，对象是类的一个个体，对应一个实例
    Cat cat1 = new Cat();
    cat1.name = "hh"; 
    cat1.age = 10;
    cat1.color = "白色";

    Cat cat2 = new Cat();
    cat2.name = "xx";
    cat2.age = 20;
    cat2.color = "黑色";

    System.out.println("猫的信息: " + cat1.name + cat1.age + cat1.color);
    System.out.println("猫的信息: " + cat2.name + cat2.age + cat2.color);
  }
}

class Cat {
  String name; // 属性，成员变量，字段
  int age;
  String color;
}
```

**属性**

* 从概念或叫法上：成员变量 = 属性 = field
* 属性是类的一个组成部分，一般是基本数据类型，也可以是引用数据类型（对象，数组）
* 属性的定义语法通变量：访问修饰符 属性类型 属性名;
* 访问修饰符：控制属性的访问范围：public、proctected、默认、private
* 属性的定义类型可以为任意类型，包含基本类型和引用类型
* 属性如果不赋值，有默认值，规则和数组一致

```java
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
```

**创建对象访问属性**

* 1、先声明再创建 Cat cat;  cat = new Cat();
* 2、直接创建 Cat cat = new Cat();
* 访问属性：对象名.属性名

```java
public class Object02 {
  public static void main(String[] args) {
    // cat1 是对象名（对象引用）
    // new Cat(); 创建的对象空间（数据）才是真正的对象
    Person p = new Person();
		p.age = 1;
    p.name = "哈哈";
    Person p1 = p;
    System.out.println(p1.age);//1
  }
}

class Person {
  String name; // 属性，成员变量，字段
  int age;
}
```

**内存结构分析**

* 栈：一般存放基本数据类型（局部变量）
* 堆：存放对象（Cat cat，数组等）
* 方法区：常量池（常量，比如：字符串），类加载信息

```java
Person p = new Person();
p.name = "jack";
p.age = 10;
```

* 先加载 Person 类信息（属性和方法信息，只会加载一次）
* 在堆中分配空间，进行默认初始化
* 把地址赋给 p, p就指向对象
* 进行指定初始化，比如：p.name = "jack"; p.age = 10
