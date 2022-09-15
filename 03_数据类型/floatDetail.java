public class floatDetail {
  public static void main(String[] args) {
    // java 的浮点型常量（具体值）默认为double型，声明float型常量，须后加'f'或'F'
    float num1 = 1.1; // 错误 ，默认是 double 类型 8个字节
    float num2 = 1.1F; // 对
    double num3 = 1.1; // 对
    double num4 = 1.1F; // 对

    double num5 = .123; // 0.123
    System.out.println(5.12e2) // 512.0
    System.out.println(5.12E-2) // 0.0512

    double num11 = 2.7;
    double num22 = 8.1 / 3; // 不是 2.7 是 2.69999999999

    if(num11 == num22) {
      System.out.println('相等');
    }

    if(Math.abs(num11 - num22) < 0.000001) {
      System.out.println('差值非常小，到规定精度，认为相等');
    }
  }
}