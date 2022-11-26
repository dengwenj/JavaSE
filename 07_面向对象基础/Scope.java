public class Scope {
  public static void main(String[] ages) {
    
  }
}

class Dmeo {
  // 全局变量
  String name; // 默认值是 null

  public void d() {
    // 局部变量
    int num = 1;
    String name = "王小波";
    System.out.println(name); // 王小波
  }

  public void d1() {
    int num1 = 2;
    System.out.println(name); // null
    System.out.println(num); // 报错 
  }
}