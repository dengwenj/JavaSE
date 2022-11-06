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