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
    // ASCLL 编码表 一个字节表示，一个 128 个字符，实际上一个字符可以表示 256 个字符
    // unicode 编码表 固定大小的编码，使用两个字节来表示字符，字母和汉字统一都是占用两个字节（浪费空间） 2个字节 2的16次方字符
    // utf-8 编码表，大小可变的编码，字母使用1个字节，汉字使用3个字节
    // gbk 编码表，大小可变的编码，字母使用1个字节，汉字使用2个字节
  } 
}
