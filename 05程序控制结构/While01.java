public class While01{
  public static void main(String[] args) {
    // 循环变量初始化
    // while(循环条件) {
      // 循环体
      // 循环变量迭代
    // }
    // 循环条件是返回一个布尔值的表达式
    // while 循环是先判断再执行语句

    int i = 1;
    while(i <= 100) {
      if(i % 3 == 0) {
        System.out.println(i);
      }
      i++;
    }

    int i1 = 40;
    while(i1 <= 200) {
      if(i1 % 2 == 0) {
        System.out.println(i1 + "哈哈");
      }
      i1++;
    }
  }
}