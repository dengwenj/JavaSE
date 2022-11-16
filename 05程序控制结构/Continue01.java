public class Continue01 {
  public static void main(String[] args) {
    // continue 语句用于借宿本次循环,继续执行下一次循环
    for(int i = 1; i <= 3; i++) {
      if(i == 2) {
        continue;
      }
      System.out.println(i);
    }
  }
}