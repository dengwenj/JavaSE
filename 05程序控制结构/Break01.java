import java.util.Scanner;

public class Break01 {
  public static void main(String[] args) {
    // 循环，但是循环的次数不知道 -> 当满足某个条件是，终止循环
    int i = 3 + 1;
    while(true) {
      Scanner myScanner = new Scanner(System.in);
      System.out.println("请输入用户名");
      String name = myScanner.next();
      System.out.println("请输入密码");
      String password = myScanner.next();
      System.out.println(name.equals("邓文杰"));
      System.out.println(password.equals("dengwj.vip"));
      // "邓文杰".equals(name) 可以避免空指针
      if(!"邓文杰".equals(name) && !"dengwj.vip".equals(password)) {
        i--;
      } else {
        System.out.println("登录成功!");
        break;
      }
 
      if(i == 0) {
        System.out.println("用户名或密码输入超过三次，过 10 分钟后才可以输入!");
        break;
      }

      System.out.println("您还有" + i + "次输入机会");
    }
  }
}