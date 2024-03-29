**类与对象**

* 每个类都有一个主方法 main()

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

**递归**

* 递归就是方法自己调用自己，每次调用时传入不同的变量，递归有助于编程者解决复杂问题。必须要有终止条件
* 各种算法中也会用到递归，比如：快排、归并排序、二分查找、分治算法
* 将用栈解决的问题 -> 递归代码比较简洁
* 执行一个方法时，就创建一个新的受保护的独立空间（栈空间）
* 方法的局部变量是独立的，不会相互影响，比如 n 变量
* 如果方法中使用的是引用类型变量（比如数组），就会共享该引用类型的数据（形参）
* 递归必须向退出递归的条件逼近，否则就是无限递归
* 当一个放大执行完毕，或者遇到 return，就会返回，遵守谁调用，就将结果返回给谁，同时当方法执行完毕或者返回时，该方法也就执行完毕（释放掉）

```java
public class Demo03 {
  public static void main(String[] args) {
    // 斐波那锲数  1 1 2 3 5 8 13
    Test test = new Test();
    // System.out.println(test.t(5));

    System.out.println(test.hh(1)); // 1534
  }
}

class Test {
  public int t(int n) {
    if(n <= 2) {
      return 1;
    }
    return t(n - 1) + t(n  - 2);
  }

  // day = 10 时有 1 个桃子
  // day = 9 时有 （day10 + 1） * 2 = 4
  // day = 8 时有（day9 + 1） * 2 = 10
  // 前一天的桃子 = （后一天的桃子 + 1） * 2
  public int hh(int day) {
    // 第十天
    if(day == 10) { // 第一天是刚开始的个数
      return 1;
    }
    return (hh(day + 1) + 1) * 2;
  }
}

// hh(1) * 2 + 1 // 15
// hh(2) * 2 + 1 // 7
// hh(3) * 2 + 1 // 3
// 1

// t(4) -> 3 + t(3) -> 2   5
// t(3) -> 2 + t(2) -> 1   4
// t(2) -> 1 + t(1) -> 1   3
//             2
```

**走迷宫**

```java
public class Demo04 {
  public static void main(String[] args) {
    int[][] map = new int[8][7];
    //  0 代表没有障碍物 1代表有

    for(int i = 0; i < map.length; i++) {
      for(int j = 0; j < map[i].length; j++) {
        if(i == 0 || i == map.length - 1) {
          map[i][j] = 1;
        } else {
          map[i][0] = 1;
          map[3][1] = 1;
          map[3][2] = 1;
          map[i][map[i].length - 1] = 1;
        }
      }
    }

    // for(int i = 0; i < map.length; i++) {
    //   for(int j = 0; j < map[i].length; j++) {
    //     System.out.print(map[i][j] + " ");
    //   }
    //   System.out.println();
    // }
    
    System.out.println("============================");
    T t1 = new T();
    t1.findWay(map, 1, 1);
  
    for(int i = 0; i < map.length; i++) {
      for(int j = 0; j < map[i].length; j++) {
        System.out.print(map[i][j] + " ");
      }
      System.out.println();
    }
  }
}
// 1代表障碍物，2代表可以走，3代表死路，0带代表没有障碍物
class T {
  public boolean findWay(int[][] map, int i, int j) {
    if(map[6][5] == 2) {
      return true;
    }
    
    if(map[i][j] == 0) {
      // 假设可以走
      map[i][j] = 2;

      if(findWay(map, i + 1, j)) { // 下
        return true;
      } else if(findWay(map, i, j + 1)) { // 右
        return true;
      } else if(findWay(map, i - 1, j)) { // 上
        return true;
      } else if(findWay(map, i, j - 1)) { // 做
        return true;
      } else {
        map[i][j] = 3;
        return false;
      }
    } else { // map[i][j] = 1, 2, 3
      return false;
    }
  }
}
```

**重载**

* java 中允许同一个类中，多个同名方法的存在，但要求形参列表不一致！！
* 方法名：必须相同
* 形参列表：必须不同（形参类型或个数或顺序，至少有一样不同，参数名无要求）
* 返回类型：无要求

```java
public class OverLoad01 {
  public static void main(String[] args) {
    // java 中允许同一个类中，多个同名方法的存在，但要求形参列表不一致！！
    // 重载的好处
    // 1、减轻了起名的麻烦
    // 2、减轻了记名的麻烦

    Demo d = new Demo();
    System.out.println(d.calculate(1, 2));

    System.out.println(d.calculate(1.1, 2));

    System.out.println(d.calculate(1, 2, 3));
  }
}

class Demo {
  // calculate 方法构成了重载
  public int calculate(int a, int b) {
    return a + b;
  }
  public double calculate(double a, int b) {
    return a + b;
  }
  public int calculate(int a, int b, int c) {
    return a + b + c;
  }
}
```

**可变参数**

* 可变参数的实参可以为0个或任意多个
* 可变参数的实参可以为数组
* 可变参数的本质就是数组
* 可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
* 一个形参列表中只能出现一个可变参数

```java
public class HSPMethod {
  public static void main(String[] args) {
    // java 允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法，就可以通过可变参数实现
    Demo d = new Demo();
    // System.out.println(d.d1(1, 2, 3, 4, 5));
    // System.out.println(d.d1(1, 2, 3, 4, 5, 10));

    Demo obj = d.showScore("邓文杰", 70, 80, 90);
    System.out.println(obj.name);
    System.out.println(obj.score);
    
    Demo obj1 = d.showScore("韩梅梅", 71, 81, 91);
    System.out.println(obj1.name);
    System.out.println(obj1.score);
  }
}

class Demo {
  String name;
  int score;

  // int... 表示接收的是可变参数，类型是 int，即可以接收多个 int(0 - 多)
  // 使用可变参数时，可以当做数组来使用，即 nums 可以当做数组
  public int d1(int... nums) {
    System.out.println(nums.length);
    int sum = 0;
    for(int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    return sum;
  }

  public Demo showScore(String name, int... score) {
    int sum = 0;
    for(int i = 0; i < score.length; i++) {
      sum += score[i];
    }

    Demo d = new Demo();
    d.name = name;
    d.score = sum;
    return d;
  }
}
```

**作用域**

* 在 java 中，主要的变量就是属性（成员变量）和局部变量
* 局部变量一般是指在成员方法中定义的变量
* java 中作用域的分类：全局变量：也就是属性，作用域为整个类体。局部变量：也就是除了属性之外的其他变量，作用域为定义它的代码块中
* 全局变量（属性）可以不赋值，直接使用，因为有默认值，局部变量必须赋值后，才能使用，因为没有默认值
* 属性和局部变量可以重名，访问是遵循就近原则
* 在同一个作用域中，比如在同一个成员方法中，两个局部变量，不能重名
* 属性生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁。局部变量，生命周期较短，伴随这它的代码块的执行而创建，伴随着代码块的结束而死亡。即在一次方法调用过程中
* 作用域范围不同：全局变量/属性：可以被本类使用，或其他类使用（通过对象调用）。局部变量：只能在本类中对应的方法中使用
* 修饰符不同：全局变量/属性可以加修饰符。局部变量不可以加修饰符 

**构造器**

```java
[修饰符] 方法名(形参列表){方法体}
```

* 构造器的修饰符可以默认(自己不写)
* 构造器没有返回值
* 方法名和类名必须一样
* 参数列表和成员方法一样的规则
* 构造器的调用系统完成
* 构造方法又叫构造器（constructor），是类的一种特殊的方法，它的主要作用是完成对新对象的初始化，在创建对象时，系统会自动的调用该类的构造器完成对象的初始化 
* 一个类可以定义多个不同的构造器，即构造器重载
* 如果我们没有定义构造器，系统会自动给类生成一个默认无参构造器（也叫默认构造器），比如：Dog() {}，使用 javap指令 可以反编译看
* 一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无参构造器，除非显式的定义一下，即：Dog(){} 

```java
class Person {
	int age = 90;
  String name;
  
  public Person(int pAge, String pName) {
    age = pAge;
    name = pName;
  }
}

Person p = new Person("韩没灭", 20);

// 流程分析
//1、加载Person类信息（Person.class），只会加载一次（属性和方法）
//2、在堆中分配空间（创建对象）this会指向这个对象
//3、完成对象初始化（默认初始化：age = 0; name = null 显式初始化：age = 90; name = null 构造器初始化：age = 20; name = "韩没灭"）
//4、对象在堆中的地址，返回给 p(p是对象名，对象的引用)
```

**this**

* java 虚拟机会给每个对象分配 this,代表当前对象
* 哪个对象调用，this就代表那个对象
* this关键字可以用来访问本类的属性、方法、构造器
* this用于区分当前类的属性和局部变量
* 访问成员方法的语法：this.方法名(参数列表)
* 访问构造器语法：this(参数列表)，注意只能在构造器中使用（即只能在构造器中访问另外一个构造器，必须放在第一条语句）
* this不能在类定义的外部使用，只能在类定义的方法中使用

```java
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
```

