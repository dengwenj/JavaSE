// 表示把 java.util 下的 Scanner 类导入
import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    // 创建 Scanner 类的对象
    Scanner myScanner = new Scanner(System.in);

    System.out.println("请输入姓名");
    String name = myScanner.next();
    System.out.println("请输入年龄");
    int age = myScanner.nextInt();
    System.out.println("请输入薪水");
    double sal = myScanner.nextDouble();

    System.out.println("姓名是：" + name + "年龄是：" + age + "薪水是：" + sal);
  }
}
