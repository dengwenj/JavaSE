public class For01 {
  public static void main(String[] args) {
    //       1             2        4
    // for(循环变量初始化; 循环条件; 循环变量迭代) {
    //       3 
    //   循环操作(可以多条语句);
    // }

    int num = 0;
    int total = 0;
    for(int i = 1; i <= 100; i++) {
      if(i % 9 == 0) {
        num++;
        total += i;
      }
    }
    System.out.println("个数是: " + num + " 总和是: " + total);

    for(int i = 0, j = 5; i <= 5; i++, j--) {
      System.out.println(i + "+" + j + "=" + (i + j));
    }

    int n = 10;
    for(int i = 0; i <= n; i++) {
      System.out.println(i + "+" + (n - i) + "=" + n);
    }
  }
}
