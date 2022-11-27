import java.util.Random;
import java.util.Scanner;

public class HomeWork03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Demo d = new Demo();

    for(int i = 0; i < 3; i++) {
      System.out.println("请出你的拳:");
      int num = s.nextInt();
      System.out.println("我出的全是:" + num);
      d.demo1();
      d.demo2(num);
      d.demo3();
      d.count += 1;
    }

    System.out.println("我赢的次数: " + d.sum);
  }
}

class Demo {
  // 电脑的出拳
  int cCQ;
  // 我的出拳
  int mCQ;
  // 局数
  int count;
  // 我赢的次数
  int sum;

  public void demo1() {
    Random r = new Random();
    this.cCQ = r.nextInt(3); // 0 石头 1 剪刀 2 布
    System.out.println("电脑出的拳是：" + this.cCQ);
  }

  public void demo2(int num) {
    this.mCQ = num;
  }

  public void demo3() {
    // 判断谁赢
    if(this.mCQ == 0 && this.cCQ == 1) {
      this.sum += 1;
      System.out.println("我赢了");
    } else if(this.mCQ == 1 && this.cCQ == 2) {
      this.sum += 1;
      System.out.println("我赢了");
    } else if(this.mCQ == 2 && this.cCQ == 0) {
      this.sum += 1;
      System.out.println("我赢了");
    } else if(this.mCQ == this.cCQ) {
      System.out.println("平局");
    } else {
      System.out.println("我输了");
    }
  }
}