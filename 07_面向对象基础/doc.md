**类与对象**

* 类式抽象的，概念的，代表一类事物，比如人类，猫类，即它是数据类型(自定义数据类型 Cat)
* 比如：Person 类 是引用数据类型  Person p = new Person();

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

**成员方法**

* 访问修饰符（作用是控制方法使用的范围）
* 如果不写默认访问，（四种：public、protected、默认、private）
* 一个方法最多有一个返回值，返回多个结果可以用数组
* 返回类型可以为任意类型，包含基本类型或引用类型
* 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值；而且要求返回值类型必须和 return 的值类型一致或兼容
* 如果方法是 void，则方法体中可以没有 return 语句，或者只写 return
* 方法名一般为驼峰命名法
* 一个方法可以有0个参数，也可以有多个参数，中间用逗号隔开
* 参数类型可以为任意类型，包含基本类型或引用类型
* 调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型的参数
* 方法定义时的参数称为形式参数，方法调用时的传入参数称为实际参数，实参和形参的类型要一致或兼容，个数，顺序必须一致
* 方法体里面不能在定义方法，方法不能嵌套定义

```java
public class Method {
  public static void main(String[] args) {
    // 方法调用小结
    // 1 当程序执行到方法时，就会开辟一个独立的空间（栈空间，方法调用栈 -> JS 里的函数调用栈）
    // 2 当方法执行完毕 ，或者执行到 return 语句时，就会返回，返回的调用方法的地方，方法会被释放
    // 3 返回后，继续执行方法后面的代码，当 main 方法（栈）执行完毕，整个程序退出
    Person p = new Person();
    p.sum();
    p.sum1(10);
    System.out.println(p.sum2(100, 200));
  }
  
  访问修饰符 返回数据类型(void 表示没有返回值) 方法名(形参列表){方法体
    语句;
    return 返回值;                    
  }
}

class Person {
  String name;
  int age;

  // public 表示方法是公开
  // void 表示方法没有返回值
  // sum() sum 表示方法名，()形参列表
  // {} 方法体，里面写执行的代码
  public void sum() {
    int sum1 = 0;
    for(int i = 1; i <= 100; i++) {
      sum1 += i;
    }
    System.out.println(sum1);
  }

  public void sum1(int n) {
    int sum = 0;
    for(int i = 0; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum);
  }

  public int sum2(int n1, int n2) {
    int res = n1 + n2;
    return res;
  }
}
```

* 同一个类中的方法调用：直接调用即可。
* 跨类中的方法 A 类调用 B 类方法：需要通过对象名调用。比如：对象名.方法名()
* 跨类的方法调用和方法的访问修饰符相关

```java
public class Method02 {
  public static void main(String[] args) {
    A a = new A();
    // a.hh();
    a.xx();
  }
}

class A {
  public void print() {
    System.out.println("我是 A 类的 print 方法");
  }
  public void hh() {
    // 同一个类中的方法调用：直接调用即可。
    print();
    System.out.println("我是 A 类的 hh 方法");
  }

  public void xx() {
    System.out.println("我是 A 类的 xx 方法前面");
    B b = new B();
    b.bb();
    System.out.println("我是 A 类的 xx 方法后面");
  }
}

class B {
  public void bb() {
    System.out.println("我是 B 类的 bb 方法");
  }
}
```

**成员方法传递机制(重要！！！！)**

* 基本数据类型，传递的是值（值拷贝），形参的任何改变不影响实参
* 引用类型传递的是地址（传递也是值，但是值是地址），可以通过形参影响实参

```java
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
```

