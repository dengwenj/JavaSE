public class Demo {
  public static void main(String[] args) {
    // 1 
    double m = 100000;
    double q0 = 50000;
    int lk = 0;
    // 小于 5000
    double q1 = 1000;
    while(true) {
      if(m > q0) {
        // 交税
        double q = m * 0.05;
        m -= q;
        lk++;
      } else if(m >= 1000) {
        m -= q1;
        lk++;
      }
      System.out.println("可以过" + lk + "次路口");
      if(m < 1000) {
        break; 
      }
    }
    
    int num = 10;
    if(num > 0) {
      System.out.println("大于零");
    } else if(num < 0) {
      System.out.println("小于零");
    } else if(num == 0) {
      System.out.println("等于零");
    }
    
    int y = 2002;
    if(y % 4 == 0 && y % 100 != 0) {
      System.out.println(y + "是闰年");
    }

    int num1 = 153;
    if(String.valueOf(num1).length() == 3) {
      // num1的百位
      int n1 = num1 / 100;
      // 十位
      int n2 = num1 % 100 / 10;
      // 个位
      int n3 = num1 % 10;
      if((n1 * n1 * n1) + (n2 * n2 * n2) + (n3 * n3 * n3) == num1) {
        System.out.println(num1 + "是水仙花数");
      }
    }

    int h = 0;
    for(int j = 1; j <= 100; j++) {
      if(j % 5 != 0) {
        if(h % 5 == 0) {
          h = 0;
          System.out.print("\n");
          System.out.print(j + " ");
        } else {
          System.out.print(j + " ");
        }
        h++; 
      }
    }

    for(char c1 = 'a'; c1 <= 'z'; c1++) {
      System.out.print(c1 + " ");
    }
    for(char c2 = 'Z'; c2 >= 'A'; c2--) {
      System.out.print(c2 + " ");
    }

    double sum1 = 0;
    for(int kk = 1; kk <= 100; kk++) {
      // 单数为加，双数为减  精度问题
      if(kk % 2 == 0) { // 双数
        sum1 -= 1.0 / kk;
      } else {
        sum1 += 1.0 / kk;
      }
    }
    System.out.println("sum1: " + sum1);

    int sum = 0;
    int total = 0;
    for(int gg = 1; gg <= 100; gg++) {
      sum += gg;
      total += sum;
    }
    System.out.println("total: " + total);
  }
}