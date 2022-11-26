public class HSPMethod {
  public static void main(String[] args) {
    // java 允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法，就可以通过可变参数实现
    Demo d = new Demo();
    System.out.println(d.d1(1, 2, 3, 4, 5));
    System.out.println(d.d1(1, 2, 3, 4, 5, 10));
  }
}

class Demo {
  // int... 表示接收的是可变参数，类型是 int，即可以接收多个 int(0 - 多)
  // 使用可变参数时，可以当做数组来使用，即 nums 可以当做数组
  public int d1(int... nums) {
    System.out.println(nums.length);
    int sum = 0;
    for(int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    return sum;
  }
}