### 面向对象中级

**包**

* 区分相同名字的类
* 当类很多时，可以很好的管理类
* 控制访问范围
* 包基本语法：package com.dengwenj;，package  关键字，表示打包。com.dengwenj:表示包名
* 包的本质实际上就是创建不同的文件夹来保存类文件
* 同一个包下可以不引入 

**包的命名**

* 只能包含数字、字母、下划线、小圆点，但不能用数字开头，不能是关键字或保留字
* Demo.ab.cd
* 一般是小写字母+小圆点
* com.公司名.项目名.业务模块名。com.hh.oa.model
* 一个包下，包含很多的类，java中常用的包有：
* java.lang：lang包是基本包，默认引入，不需要再导入
* java.util：util包，系统提供的工具包，工具类，使用 Scanner
* java.net：网络包，网络开发
* Java.awt：做java的界面开发

**如何引入包**

* 语法：import 包
* 比如：import java.util.Scanner；就只是引入一个类 Scanner
* import java.util.* 表示将 java.util 包所有都引入
* `package`的作用是声明当前类所在的包，需要放在类的最上面，一个类中最多只有一个 package
* import 指令位置放在 package 的下面，在类定义前面，可以有多个且没有顺序要求

```java
package dengwj.zww;

import java.util.Arrays;

public class Person {
  public static void main(String[] args) {
    System.out.println("我是dengwj.zww包里面的类文件");

    int[] arr = {1, 2, 6, 4, 3, 5};
    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
```

**访问修饰符**

* java 提供四种访问控制修饰符号，用于控制方法和属性（成员变量）的访问权限（范围）
* 1、公开级别：用 public 修饰，对外公开
* 2、受保护级别：用protected修饰，对子类和同一个包中的类公开
* 3、默认级别：没有修饰符号，向同一个包的类公开
* 4、私有级别：用 private 修饰，只有类本身可以访问，不对外公开

* 在同一类中，可以访问 public protected 默认 private 修饰属性和方法
* 在同一个包下，可以访问 public protected 和默认修饰属性或方法，不能访问 private属性或方法
* 在不同包下，可以访问 public 修饰的属性或方法，但是不能访问 protected，默认，private修饰的属性或方法
* 修饰符可以用来修饰类中的属性，成员方法，以及类
* 只有默认的和 public 才能修饰类，并且遵循上述访问权限的特点

**封装**

* 封装（encapsulation）就是把抽象出的数据属性和对数据的操作方法封装在一起，数据被保护在内部，程序的其他部分只有通过被授权的操作方法，才能对数据进行操作。

* 封装的理解和好处：1、隐藏实现细节：方法 -> 调用

* 2、可以对数据进行验证，保证安全合理

* ```java
  封装三步骤
  1、将属性进行私有化 private（不能直接修改属性）
  2、提供一个公共的（public）set方法，用于对属性判断并赋值
  public void setXxx(类型 参数名) { // Xxx 表示某个属性
    // 加入数据验证的业务逻辑
    属性 = 参数名;
  }
  3、提供一个公共的（public）get方法，用于获取属性的值
  public 数据类型 getXxx() { // 权限判断， Xxx某个属性
  	return xx;  
  }
  ```

```java
package com.encap;

public class Encapsulation01 {
  public static void main(String[] args) {
    person person = new person();
    person.setName("邓文杰1666");
    System.out.println(person.getName());
    person.setAge(120);
    System.out.println(person.getAge());
    person.setSalary(50000);
    System.out.println(person.getSalary());
  }
}

class person {
  public String name;
  private int age; // 私有
  private double salary; // 私有

  public String getName() {
//    判断一些权限，权限够就给你返回 name
    return name;
  }

  public void setName(String name) {
    if (name.length() >= 2 && name.length() <= 6) {
      this.name = name;
      return;
    }
    System.out.println("姓名长度没有在2-6之间，给默认姓名");
    this.name = "韩梅梅";
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age >= 1 && age <= 120) {
      this.age = age;
      return;
    }
    System.out.println("年龄没有在1-120之间，给默认年龄");
    this.age = 22;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    if (salary >= 10000) {
      this.salary = salary;
      return;
    }
    System.out.println("薪水没有超过1w我给你1w");
    this.salary = 10000;
  }
}
```

**继承**

* 两个类的属性和方法有很多时相同的，怎么办？ => 继承（代码复用性）

* 继承可以解决代码复用，让我们的编程更加靠近人类思维，当多个类存在相同的属性（变量）和方法时，可以从这些类中抽象出父类，在父类中定义这些相同的属性和方法，所有的子类不需要重新定义这些属性和方法，只需要通过 `extends`来声明继承父类即可。

* ```java
  // 继承基本语法
  class 子类 extends 父类 {}
  // 子类就会自动拥有父类定义的属性和方法
  // 父类又叫超类，基类
  // 子类又叫派生类
  ```

**继承细节**

* 1、子类继承了所有的属性和方法，非私有的属性和方法可以在子类直接访问，但是私有属性和方法不能在子类直接访问，要通过父类提供公共的方法去访问。

* 2、子类必须调用父类的构造器，完成父类的初始化。

* 3、当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，如果父类没有提供无参构造器，则必须在子类的构造器中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过。

* 4、如果希望指定去调用父类的某个构造器，则显式的调用一下：super(参数列表)

* 5、super 在使用时，必须放在构造器第一行（super只能在构造器中使用）

* 6、super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器

* ```
  package com.extends_;
  
  public class ExtendsDetail {
    public static void main(String[] args) {
      Sub sub = new Sub();
      sub.ww();
      sub.hmm();
    }
  }
  
  package com.extends_;
  
  public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
  
    // 无惨构造器
    public Base() {
  
    }
  
    public int getN4() {
      return n4;
    }
  
    public void test1() {
      System.out.println("test1");
    }
  
    protected void test2() {
      System.out.println("test2");
    }
  
    void test3() {
      System.out.println("test3");
    }
  
    private void test4() {
      System.out.println("test4");
    }
  
    public void test5() {
      test4();
    }
  }
  
  package com.extends_;
  
  public class Sub extends Base {
    /**
     * 1、子类继承了所有的属性和方法，非私有的属性和方法可以在子类直接访问，
     * 但是私有属性和方法不能在子类直接访问，要通过父类提供公共的方法去访问。
     */
    public void ww() {
      System.out.println(n1 + " " + n3 + " " + n3);
    }
  
    public void hmm() {
      System.out.println(getN4());
      test1();
      test2();
      test3();
      test5();
    }
  }
  ```

* 

