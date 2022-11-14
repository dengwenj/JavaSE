import java.util.Scanner; 

public class DoWhile01 {
  public static void main(String[] args) {
    // 循环条件是返回一个布尔值的表达式
    // do..while 循环是先执行，再判断，因此它至少执行一次

    // 循环变量初始化
    // do{
    //   // 循环体（语句）
    //   // 循环变量迭代
    // } while(循环条件);
    
    int i = 1;
    do{
      System.out.println(i + "哈哈");
      i++;
    } while(i <= 100);

    int i1 = 1;
    int total = 0;
    do{
      if(i1 == 100) {
        System.out.println(total + "嘻嘻");
      }
      total += i1;
      i1++;
    } while(i1 <= 100);

    int i2 = 1;
    int num = 0;
    do{
      if(i2 % 5 == 0 && i2 % 3 != 0) {
        num++;
        System.out.println(num + "嘿嘿");
      }
      i2++;
    } while(i2 <= 200);


    Scanner myScanner = new Scanner(System.in);
    boolean b = false;
    do{
      System.out.println("返钱吗?");
      String s = myScanner.next();
      System.out.println(s + "jkqjk");
      if(s == "y") {
        b = true;
      } else {
        b = false;
      }
    } while(b); // b 为 true 就退出循环
  }
}
