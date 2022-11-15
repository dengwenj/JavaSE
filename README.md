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
    
    // 字符型存储到计算机中，需要将字符对应的码值（整数）找出来
    // 存储: 'a' => 码值 97 => 二进制(110 0001) => 存储
    // 读取: 二进制  => 97 => 'a' => 显示
    // 字符和码值的对应关系是通过字符编码表决定的
    // ASCLL 编码表 一个字节表示，一个 128 个字符，实际上一个字符可以表示 256 个字符(缺点：不能表示所有字符)
    // unicode 编码表 固定大小的编码，使用两个字节来表示字符，字母和汉字统一都是占用两个字节（缺点：浪费空间）
    // utf-8 编码表，大小可变的编码，字母使用1个字节，汉字使用3个字节
    // gbk 编码表，大小可变的编码，字母使用1个字节，汉字使用2个字节
  }
}
```

**基本数据转换细节**

* 有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。
* 当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时，会报错。反之会自动转换
* byte、short 和 char 之间不会相互自动转换。
* byte、short、char 三者可以计算，在计算时首先转换为 int 类型
* boolean 不参与转换
* 自动提升原则：表达式结果的类型自动提升为操作数中最大的类型

**强制数据类型转换细节**

* 当进行数据的大小从 大 -> 小，就需要使用到强制转换
* 强制符号只针对于最近的操作数有效，往往会使用小括号提升优先级
*  char 类型可以保存 int 的常量值，但不能保存 int 的变量值，需要转换
* byte 和 short char 类型在进行运算时，当做 int 类型处理

**自动类型转换精度小的转大的** **char -> int -> long -> float -> double**     **byte -> short -> int -> long -> float -> double**

**基本数据类型转字符串、字符串转基本数据类型**

```java
public class StringToBasic {
  public static void main(String[] args) {
    // 基本类型转 String 类型
    // 将基本类型的值 + "" 即可
    int n1 = 100;
    byte n2 = 100;
    short n3 = 100;
    float n4 = 10f;
    double n5 = 18;
    boolean b1 = true;
    String s1 = n1 + "";
    String s2 = n2 + "";
    String s3 = n3 + "";
    String s4 = n4 + "";
    String s5 = n5 + "";
    String s6 = b1 + "";

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);

    // String 类型转基本数据类型
    String str1 = "123";
    String s2 = "true";
    int num1 = Integer.parseInt(str1);
    double num2 = Double.parseDouble(str1);
    float num3 = Float.parseFloat(str1);
    // boolean b333 = Boolean.parseBoolean(s2);
    // ...

    // 把字符串转成字符 char -> 含义是指 把字符串的第一个字符得到
    System.out.println(str1.charAt(0)); // '1' 字符1
  }
}
```

### 算数运算符

**除、取余、前++、后++**

```java
public class ArithmeticOperator {
  public static void main(String[] args) {
    System.out.println(10 / 4); // 数学上是 2.5 java 中是 2
    System.out.println(10.0 / 4); // java 中是 2.5
    double d = 10 / 4; // 2.0
    System.out.println(d); // 2.0

    // % 取模，取余
    // % 的本质，公式: a % b = a - a / b * b
    System.out.println(10 % 3); // 1
    System.out.println(-10 % 3); // -1
    System.out.println(10 % -3); // 1
    System.out.println(-10 % -3); // -1

    // 前++：++i 先自增后赋值
    // 后++：i++ 先赋值后自增
    int j = 2;
    // int k = ++j; // 等价 j = j + 1; k = j
    // System.out.println(j, k); // 3, 3
    int k = j++; // 等价 k = j; j = j + 1;
    System.out.println(j); // 3, 2
    System.out.println(k); // 3, 2
    
    int i = 1;
    i = i++; // (1) temp = i; (2) i = i + 1; (3) i = temp
    System.out.println(i); // 1
    int h = 1;
    h = ++h; // (1) h = h + 1; (2) temp = h; (3) h = temp
    System.out.println(h); // 2
  }
}
```

**关系运算符**

* 关系运算符的结果都是 boolean 型
* 关系运算符组成的表达式，称为关系表达式: a>b

```java
public class RelationalOperator {
  public static void main(String[] args) {
    // 关系运算符的结果都是 boolean 型，
    // 关系运算符组成的表达式，称为关系表达式: a>b
    int a = 10;
    int b = 11;
    System.out.println(a > b); // F
    System.out.println(a != b); // T
    System.out.println(a == b); // F
    System.out.println(a < b); // T
    boolean c = a > b;
    System.out.println(c); // F
  }
}
```

**逻辑运算符**

* 逻辑运算符：用于连接多个条件(多个关系表达式)，最终的结果也是一个boolean值
* 短路与 &&，短路或||，取反!
* 逻辑与&，逻辑或|, ^ 逻辑异或
* 对于 && 短路与而言，如果第一个条件为 false，后面的条件不再判断。
* 对于 & 逻辑与而言，如果第一个条件为 false，后面的条件仍然会判断。
* a ^ b：叫逻辑异或，当 a 和 b 不同时，则结果为 true，否则为 false
* 短路或||：如果第一个条件为 true，则第二个条件不会判断，最终结果为 true，效率高
* 逻辑或|：不管第一个条件是否为 true，第二个条件都要判断，效率低

```java
public class LogicalOperators {
  public static void main(String[] args) {
    // 逻辑运算符：用于连接多个条件(多个关系表达式)，最终的结果也是一个boolean值
    // 短路与 &&，短路或||，取反!
    // 逻辑与&，逻辑或|, ^ 逻辑异或
    // 对于 && 短路与而言，如果第一个条件为 false，后面的条件不再判断。
    // 对于 & 逻辑与而言，如果第一个条件为 false，后面的条件仍然会判断。
    // a ^ b：叫逻辑异或，当 a 和 b 不同时，则结果为 true，否则为 false
    // 短路或||：如果第一个条件为 true，则第二个条件不会判断，最终结果为 true，效率高
    // 逻辑或|：不管第一个条件是否为 true，第二个条件都要判断，效率低
    boolean a = true;
    boolean b = false;
    if(a && b) {
      System.out.println('进来了!')
    }
  }
}
```

**赋值运算符**

* 赋值运算符: 赋值运算符就是将某个运算后的值，赋给指定的变量
* 运算顺序从右往左 int num = a + b + c;
* 赋值运算符的左边只能是变量，右边可以是变量、表达式、常量值
* 复合赋值运算符会进行类型转换

```java
public class AssignOperator {
  public static void main(String[] args) {
    // 赋值运算符: 赋值运算符就是将某个运算后的值，赋给指定的变量
    // 赋值运算符特点
    // 1、运算顺序从右往左 int num = a + b + c;
    // 2、赋值运算符的左边只能是变量，右边可以是变量、表达式、常量值
    // 3、复合赋值运算符会进行类型转换
    byte b = 2; //
    b += 3; // 等价 b = (byte)(b + 2); 默认会转换为 int，底层做了 (byte)(b + 2);
    b++; // b = (byte)(b + 1); 
  }
}
```

**三元运算符**

```java
public class Ternaryoperator {
  public static void main(String[] args) {
    // 三元运算符
    // 表达式1和表达式2要为可以赋给接收变量的类型(或可以自动转换)
    int a = 11;
    int b = 22;
    int res = a > b ? a++ : b++; // 先赋值再++ 所以 res 是 22
    System.out.println(res);

    // int res1 = a > b ? 1.1 : 2.2; // 报错，类型不行
    // double res1 = a > b ? 1 : 2; // 这样可以， 低精度转成高精度的
  }
}
```

**键盘输入**

```java
// 表示把 java.util 下的 Scanner 类导入
import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    // 创建 Scanner 类的对象
    Scanner myScanner = new Scanner(System.in);

    System.out.println("请输入姓名");
    String name = myScanner.next();
    System.out.println("请输入年龄");
    int age = myScanner.nextInt();
    System.out.println("请输入薪水");
    double sal = myScanner.nextDouble();

    System.out.println("姓名是：" + name + "年龄是：" + age + "薪水是：" + sal);
  }
}
```

**进制**

* 1、二进制：0,1，满2进1，以0b或0B开头
* 2、十进制：0-9，满10进1。生活中用的就是10进制
* 3、八进制：0-7，满8进1。以数字0开头表示
* 4、十六进制：0-9及A(10)-F(15)，满16进1.以0x或0X开头表示，不分大小写

**`其他进制转十进制方法：从最低位（右边）开始，将每个位上的数提取出来，乘以其他进制的（位数-1）次方，然后求和`**

**`十进制转成其他进制方法：将该数不断除以其他进制，直到商为0为止，然后将每步得到的余数倒过来，就是对应的其他进制`**

```
123 转 二，678 转八，8912转16，再把这些转的转成10进制
```

**二进制转为八进制**

* 从低位开始，将二进制数每三位一组，转成对应的八进制即可。
* ob11(3)010(2)101(5) -> 转成八进制（0325）

**二进制转为十六进制**

* 从低位开始，将二进制数每四位一组，转成对应的十六进制数即可。
* 0x1101(d)0101(5) -> 转成十六进制（0xd5）

**八进制转成二进制**

* 将八进制数每一位，转成对应的一个三位的二进制数即可。
* 02(010)3(011)7(111) ->转成二进制（0b010011111）

**十六进制转成二进制**

* 将十六进制数每一位，转成对应的4位的一个二进制数即可
* 0x2(0010)3(0011)B(1011) ->转成二进制（0x001000111011）

**二进制在运算中的说明**

* 二进制是逢2进1的进位制，0、1是基本算符。
* 二进制（binary）按从左至右的次序，这个值以二倍递增

**原码、反码、补码（重点）（他们就是二进制）**

* 二进制的最高位是符号位：0表示正数，1表示负数
* 正数的原码、反码、补码都一样
* 负数的反码 = 它的原码符号位不变，其他位取反
* 负数的补码 = 它的反码 + 1，负数的反码 = 负数的补码 - 1
* 0的反码，补码都是0
* java没有无符号数，java 中的数都是有符号的
* 在计算机运算的时候，都是已补码的方式来运算的（补码可以解决正数和负数，他把正数和负数统一起来了）
* 当我们看运算结果的时候，要看他的原码

**位运算符**

* java 中有 7 个位运算（&、|、^、~、>>、<<、>>>）
* 按位与&：两位全为1，结果为1，否则为0
* 按位或|：两位有一个为1，结果为1，否则为0
* 按位异或^：两位一个为0，一个为1，结果为1，否则为0
* 按位取反~：0->1、1->0
* 算术右移>>：低位溢出，符号位不变，并用符号位补溢出的高位
* 算术左移<<：符号位不变，低位补0
* 逻辑右移也叫无符号右移>>>：低位溢出，高位补0
* int a = 1>>2  -> 本质：1 / 2 / 2 = 0
* Int c = 1 << 2 -> 本质：1 * 2 * 2 = 4
* 2&3、~-2、~2、2|3、2^3、13&7、5|4、-3^3 

```java
public class BitOperation {
  public static void main(String[] args) {
    // 2&3、~-2、~2、2|3、2^3、13&7、5|4、-3^3

    // 运算都是已补码的方式运算的，看是以原码的方式看的
    // 2 的原码因为是正数所以二进制最高位是0: 00000000 00000000 00000000 00000010 (三码合一都是一样的)
    // 2 的补码: 00000000 00000000 00000000 00000010
    // 3 的原码: 00000000 00000000 00000000 00000011
    // 3 的补码: 00000000 00000000 00000000 00000011
    // 2 & 3 两位都是1才为1否则为0，即： 00000000 00000000 00000000 00000010 运算后的补码 看的是原码
    // 因为二进制的最高位是0是正数，所以三码合一，运算后的原码是: 00000000 00000000 00000000 00000010 即结果为2
    System.out.println(2 & 3); // 2

    // -2 的原码: 10000000 00000000 00000000 00000010 因为是负数，所以二进制的最高位是1
    // -2 的补码: 负数的补码 = 它的反码 + 1，即先要算出它的反码
    // -2 的反码: 负数的反码 = 它的原码符号位不变(即最高位)，其他位取反, 即: 11111111 11111111 11111111 11111101
    // -2 的补码: 11111111 11111111 11111111 11111110
    // 运算后的补码为: 00000000 00000000 00000000 00000001 
    // 运算后的原码为: 因为是二进制的最高位是 0 所以是正数,即三码合一: 00000000 00000000 00000000 00000001
    System.out.println(~-2); // 1

    // 2 的原码: 00000000 00000000 00000000 00000010
    // 2 的补码: 00000000 00000000 00000000 00000010
    // 运算后的补码: 11111111 11111111 11111111 11111101
    // 运算后的原码: 先得出它的反码 -> 他的补码 - 1 
    // 运算后的反码: 11111111 11111111 11111111 11111100
    // 运算后的原码: 反推 -> 负数的反码 = 它的原码最高位不变，其余取反. 即: 10000000 00000000 00000000 00000011
    System.out.println(~2); // -3

    // 2 的原码 00000000 00000000 00000000 00000010
    // 2 的补码 00000000 00000000 00000000 00000010
    // 3 的原码 00000000 00000000 00000000 00000011
    // 3 的补码 00000000 00000000 00000000 00000011
    // 运算后的补码 00000000 00000000 00000000 00000011
    // 运算后的原码 00000000 00000000 00000000 00000011
    System.out.println(2 | 3); // 3

    // -3 的原码 10000000 00000000 00000000 00000011
    // -3 的补码 负数的补码 = 它的反码 + 1
    // -3 的反码 负数的反码 = 它的原码最高位不变，其余取反 即: 11111111 11111111 11111111 11111100
    // -3 的补码 11111111 11111111 11111111 11111101
    // 3 的原码 00000000 00000000 00000000 00000011
    // 3 的补码 00000000 00000000 00000000 00000011
    // 运算后的补码 11111111 11111111 11111111 11111110
    // 运算后的补码 = 它的反码 + 1   它的反码 = 运算后的补码 - 1
    // 运算后的反码 11111111 11111111 11111111 11111101
    // 运算后的原码 10000000 00000000 00000000 00000010
    System.out.println(-3 ^ 3); // -2
  }
}
```

### 程序控制结构

**三大流程控制语句**

* 顺序控制
* 分支控制（让程序有选择的执行）(ifelse、switch)
* 循环控制（for、while、do..while）

**只要是个表达式就有一个值返回**

**switch细节**

* 表达式数据类型，应和 case 后的常量类型一致，或者是可以自动转换可以相互比较的类型，比如：输入的是字符，而常量是 int
* switch(表达式)中表达式的返回值必须是：（byte、short、int、char、enum、String）
* case子句中的值必须是常量（1，'a'）或者是常量表达式，而不能是变量
* default是可选的
* break语句用来在执行完一个 case 分支后使程序跳出 switch 语句块，如果没有写 break，程序会顺序执行到 switch 结尾

**for循环**

* for 有四要素：1、循环变量初始化。2、循环条件。3、循环操作。4、循环变量迭代
* 循环条件是返回一个布尔值的表达式
* for(;循环判断条件;)中的初始化和变量迭代可以写到其他地方，但是两边的分号不能省略
* 循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开

```java
public class For01 {
  public static void main(String[] args) {
    //       1             2        4
    // for(循环变量初始化; 循环条件; 循环变量迭代) {
    //       3 
    //   循环操作(可以多条语句);
    // }

    int num = 0;
    int total = 0;
    for(int i = 1; i <= 100; i++) {
      if(i % 9 == 0) {
        num++;
        total += i;
      }
    }
    System.out.println("个数是: " + num + " 总和是: " + total);

    for(int i = 0, j = 5; i <= 5; i++, j--) {
      System.out.println(i + "+" + j + "=" + (i + j));
    }

    int n = 10;
    for(int i = 0; i <= n; i++) {
      System.out.println(i + "+" + (n - i) + "=" + n);
    }
  }
}
```

**While循环**

* 循环条件是返回一个布尔值的表达式
* while 循环是先判断再执行语句

```java
public class While01{
  public static void main(String[] args) {
    // 循环变量初始化
    // while(循环条件) {
      // 循环体
      // 循环变量迭代
    // }
    // 循环条件是返回一个布尔值的表达式
    // while 循环是先判断再执行语句

    int i = 1;
    while(i <= 100) {
      if(i % 3 == 0) {
        System.out.println(i);
      }
      i++;
    }

    int i1 = 40;
    while(i1 <= 200) {
      if(i1 % 2 == 0) {
        System.out.println(i1 + "哈哈");
      }
      i1++;
    }
  }
}
```

**do..while**

* 循环条件是返回一个布尔值的表达式
* do..while 循环是先执行，再判断，因此它至少执行一次

```java
import java.util.Scanner; 

public class DoWhile01 {
  public static void main(String[] args) {
    // 循环条件是返回一个布尔值的表达式
    // do..while 循环是先执行，再判断，因此它至少执行一次

    // 循环变量初始化
    // do{
    //   // 循环体（语句）
    //   // 循环变量迭代
    // } while(循环条件);
    
    int i = 1;
    do{
      System.out.println(i + "哈哈");
      i++;
    } while(i <= 100);

    int i1 = 1;
    int total = 0;
    do{
      if(i1 == 100) {
        System.out.println(total + "嘻嘻");
      }
      total += i1;
      i1++;
    } while(i1 <= 100);

    int i2 = 1;
    int num = 0;
    do{
      if(i2 % 5 == 0 && i2 % 3 != 0) {
        num++;
        System.out.println(num + "嘿嘿");
      }
      i2++;
    } while(i2 <= 200);


    Scanner myScanner = new Scanner(System.in);
    boolean b = false;
    do{
      System.out.println("返钱吗?");
      String s = myScanner.next();
      System.out.println(s + "jkqjk");
      if(s == "y") {
        b = true;
      } else {
        b = false;
      }
    } while(b); // b 为 true 就退出循环
  }
}
```

**双重循环**

```java
import java.util.Scanner;

public class DoubleFor {
  public static void main(String[] args) {
    int class1 = 3; // 班
    int student = 5; // 每个班学生
    double allClassScore = 0; // 所有班级分数
    int jg = 0; // 及格人数
    Scanner myScanner = new Scanner(System.in);

    for(int i = 1; i <= class1; i++) {
      double sum = 0; // 每个班的成绩
      for(int j = 1; j<= student; j++) {
        System.out.println("请输入第" + i + "个班级第" + j + "个学生的成绩: ");
        double score = myScanner.nextDouble();
        if(score >= 60) {
          jg++;
        }
        sum += score;
      }
      allClassScore += sum;
      System.out.println(i + "班的总分数是: " + sum + ", 平均分数是: " + (sum / student));
    }
    System.out.println("所有班级总分是: " + allClassScore + ", 所有平均分是: " + 
      (allClassScore / (class1 * student)) + "及格人数为: " + jg);

    // 99 乘法表
    for(int i = 1; i <= 9; i++) { // 前面那个数
      String s = "";
      for(int j = 1; j <= i; j++) {
        s += j + "×" + i + "=" + (i * j) + " ";
      }
      System.out.println(s);
    }
  }
}
```

