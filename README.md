## Java 知识点

### Java 特点

* java 语言是面向对象的（oop）
* java 语言是健壮的。java的强类型机制、异常处理、垃圾的自动回收
* java 语言是跨平台的（windows、Linux）
* java 语言是解释型语言。还有 JavaScript、php、编译性语言：c/c++。区别：解释性语言，编译后的代码，不能直接被机器执行，需要解释器（jvm）来执行，编译性语言，编译后的代码，可以直接被机器执行。
* 因为有了jvm，同一个java程序在三个不同的操作系统中都可以执行，这样就实现了java程序的跨平台性

### java运行机制及运行过程

* java核心机制-java虚拟机（JVM java virtual machine）
* JVM 是一个虚拟的计算机，具有指令集并使用不同的存储区域。负责执行指令，管理数据、内存、寄存器、包含在JDK（java开发工具包）中
* 对于不同的平台，有不同的虚拟机
* java虚拟机机制屏蔽了底层运行平台的差别，实现了“一次**编译**，到处**运行**”

### 什么是JDK、JRE

* JDK的全称（java Development Kit。 java开发工具包）
* JDK = JRE + java 的开发工具（java、javac、javadoc、javap等）
* JDK是提供给 java 开发人员使用的，其中包含了java的开发工具，也包括了JRE
* JRE（java runtime environment。 java运行环境）
* JRE = JVM + java的核心类库
* 包括java虚拟机（jvm java virtual machine）和java程序所需的核心类库等

### JDK、JRE 和 JVM 的包含关系

* JDK = JRM + 开发工具集（例如：javac、java编译工具等）
* JRE = JVM + javaSE标椎类库（java核心类库）
* JDK = JVM + JavaSE标椎类库 + 开发工具集

### java开发注意事项和细节说明

* 一个源文件中最多只能有一个 public 类，其他类的个数不限
* 如果源文件包含一个 public 类，则文件名必须按该类名命名
* 一个源文件中最多只能有一个 public 类，其他类的个数不限，也可以将 main 方法写在非 public类中，然后指定运行非 public 类，这样入口方法就是非 public 的 main 方法

```java
public class Hello {
  public static void main(String[] args) {
    System.out.println("你好");
  }
}

class Ww {
  public static void main(String[] args) {
    System.out.println("你好 Ww");
  }
}

class Dwj {
  public static void main(String[] args) {
    System.out.println("你好 邓文杰");
  }
}
```

### 转义字符

```java
public class ChangeChar {
  public static void main(String[] args) {
    System.out.println("上海\t北京\t重庆\t天津");
    System.out.println("上海\n北京\n重庆\n天津");
    System.out.println("上海\\北京\\重庆\\天津");
    System.out.println("上海\"北京\"重庆\"天津");
    System.out.println("你好啊\r上海"); // 上海啊
    System.out.println("姓名\t年龄\t性别\n邓文杰\t22\t男");
  }
}
```

### 变量

* 变量相当于内存中一个数据存储空间的表示

**变量使用注意事项**

* 变量表示内存中一个存储区域，不同的变量，类型不同，占用的空间大小不同，比如：int 4个字节、double是8个字节
* 该区域有自己的名称变量名和类型数据类型
* 变量必须先声明后使用
* 该区域的数据可以在同一类型范围内不断变化
* 变量在同一个作用域内不能重名
* 变量 = 变量名 + 值 + 数据类型

### 数据类型

**每一种数据都定义了明确的数据类型，在内存中分配了不同大小的内存空间（根据字节分配不同带下的空间）**

**基本数据类型**

* 整数类型，存放整数（byte【1】(字节 -128 ~ 127)、short【2】(短整型)、int【4】(整型)、long【8】(长整型)）【1】代表一个字节，存放的范围也不一样
* 浮点类型，float【4】，double【8】
* 字符类型char【2】，存放单个字符 'a'
* 布尔类型boolean【1】存放 true，false

```java
byte n1 = 20 // 在内存中占用了一个字节，空间占用的小
short n3 = 20 // 在内存中占用了2个字节
int n2 = 20 // 在内存中占用了4个字节，空间占用的多
```

**整数类型**

* java个整数类型有固定的范围和字段长度，不受具体OS（操作系统）的影响，以保证java程序的可移植性
* java的整型常量（具体值）默认为int型，声明long型常量须后加 'l' 或 'L'
* java 程序中变量常声明为int型，除非不足以表示大数，才使用long
* bit：计算机中的最小存储单位。byte：计算机中基本存储单位，1byte = 8bit。

```java
public class IntDetail {
  public static void main(String[] args) {
    int n = 2; // 4 个字节
    // int n1 = 20L; // 报错
    long n2 = 20L;
    System.out.println(n2);
    System.out.println(n);
  }
}
```

**浮点类型**

* 关于浮点数在机器中存放形式。浮点数 = 符号位 + 指数位 + 尾数位
* 尾数部分可能丢失，造成精度损失（小数都是近似值）

* java的浮点型常量默认为double型，声明float型常量，须后加 'f' 或 'F'
* 浮点型常量有两种表示形式。十进制数形式：如：5.12 、 .512（必须有小数点）
* 科学计数法形式：5.12e2 、5.12E-2
* 通常情况下，应该使用double型，因为它比 float型更精确
* Float(单精度 4个字节)、double(双精度 8个字节)

```java
double num = 2.1234567851;
float num1 = 2.1234567851F;
System.out.println(num); // 2.1234567851
System.out.println(num1); // 2.1234567

double num11 = 2.7;
double num22 = 8.1 / 3; // 不是 2.7 是 2.69999999999

if(num11 == num22) {
  System.out.println('相等');
}

if(Math.abs(num11 - num22) < 0.000001) {
  System.out.println('差值非常小，到规定精度，认为相等');
}
```

**字符类型**

* 字符常量是用单引号'' 括起来的单个字符。
* 在 java 中，char 的本质是一个整数，在输出时，是 unicode 码对应的字符。
*  可以直接给 char 赋一个整数，然后输出时，会按照对应的 unicode 字符输出
* char 类型可以进行运算，相当于一个整数，因为它都对应有 unicode 码

```java
// 字符基本使用
public class Char01 {
  public static void main(String[] args) {
    char c1 = 'a';
    char c2 = '哈';
    char c3 = 97; // 输出的是 97表示的字符

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

    // 1、字符常量是用单引号'' 括起来的单个字符。
    // 在 java 中，char 的本质是一个整数，在输出时，是 unicode 码对应的字符。
    // 可以直接给 char 赋一个整数，然后输出时，会按照对应的 unicode 字符输出
    // char 类型可以进行运算，相当于一个整数，因为它都对应有 unicode 码
    char c4 = 98;
    System.out.println((int)c4); // 98
    char c5 = '邓';
    System.out.println((int)c5); // 37011
    char c6 = 'c' + 1;
    System.out.println((int)c6); // 100
    System.out.println(c6); // d
  }
}
```

