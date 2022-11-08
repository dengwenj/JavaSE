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
