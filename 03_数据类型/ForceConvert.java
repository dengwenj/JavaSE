// 强制类型转换
public class ForceConvert {
  public static void main(String[] args) {
    // 自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使用时要加上强制转换符(), 但可能造成精度降低或溢出。 

    int n1 = (int)1.9;
    System.out.println(n1); // 1, 造成精度损失

    int n2 = 2000;
    byte b1 = (byte)n2;
    System.out.println(b1); // 造成数据溢出

    // 当进行数据的大小从 大 -> 小，就需要使用到强制转换
    // 强制符号只针对于最近的操作数有效，往往会使用小括号提升优先级
    // int x = (int)10 * 3.5 + 6 * 1.5; // 错误
    int y = (int)(10 * 3.5 + 6 * 1.5); // ok
    System.out.println(y);

    // char 类型可以保存 int 的常量值，但不能保存 int 的变量值，需要转换
    char c1 = 100;
    int m = 100;
    // char c2 = m; // 错误
    char c3 = (char)m; // ok
    System.out.println(c3); // 100 对应的字符是 d

    // byte 和 short char 类型在进行运算时，当做 int 类型处理
  }
}