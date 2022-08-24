public class floatDetail {
  public static void main(String[] args) {
    // java 的浮点型常量（具体值）默认为double型，声明float型常量，须后加'f'或'F'
    float num1 = 1.1; // 错误 ，默认是 double 类型
    float num2 = 1.1F; // 对
    double num3 = 1.1; // 对
    double num4 = 1.1F; // 对

    double num5 = .123; // 0.123
    System.out.println(5.12e2) // 512.0
    System.out.println(5.12E-2) // 0.0512
  }
}