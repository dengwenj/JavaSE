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
  }
}
