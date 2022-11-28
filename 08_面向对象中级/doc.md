### 面向对象中级

**包**

* 区分相同名字的类
* 当类很多时，可以很好的管理类
* 控制访问范围
* 包基本语法：package com.dengwenj;，package  关键字，表示打包。com.dengwenj:表示包名
* 包的本质实际上就是创建不同的文件夹来保存类文件

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