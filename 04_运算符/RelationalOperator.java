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