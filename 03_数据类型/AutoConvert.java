// 自动转换
public class AutoConvert {
  public static void main(String[] args) {
    int num = 'a';
    double d = 100;
    // 当 java 程序在进行赋值或者运算时，精度小的类型自动转换为精度大的数据类型，自动转换
    // char -> int -> long -> float -> double
    // byte -> short -> int -> long -> float -> double
    System.out.println(num); // 97
    System.out.println(d); // 100.0

    // 有多种类型的数据混合运算时，
    // 系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
    int n1 = 10; // ok
    // float d1 = n1 + 1.1 // 错误
    float d2 = n1 + 1.1f; // 正确
    double d3 = n1 + 1.1; // 正确

    // 当我们把精度（容量） 大的数据类型赋值给精度（容量）小的数据类型时，就会报错，反之就会进行自动类型转换
    // int n2 = 1.1; // 错误 double -> int 不行

    // byte，short 和 char 之间不会相互自动转换
    // 当把具体数赋给 byte 时，先判断该数是否在 byte 范围内，如果是就可以
    byte b1 = 10; // 对
    int n2 = 1;
    // byte b2 = n2; // 错误 如果是变量赋值，判断类型
    // char c1 = b1; // 错误，原因 byte 不能自动转换成 char

    // byte short char 他们三者可以计算，在计算时首先转换为 int 类型 出现其中一个都要转
    byte b2 = 1;
    byte b3 = 2;
    short s1 = 1;
    // short s2 = b2 + s1; // 错  b2 + s1 => int
    int s2 = b2 + s1; // 对
    byte b4 = b2 + b3; // 错误 b2 + b3 => int

    // boolean 不参与转换
    // 自动提升原则：表达式结果的类型自动提升为操作数中最大的类型
  }
}
