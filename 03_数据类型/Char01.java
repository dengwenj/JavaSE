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
