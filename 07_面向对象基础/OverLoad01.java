public class OverLoad01 {
  public static void main(String[] args) {
    // java 中允许同一个类中，多个同名方法的存在，但要求形参列表不一致！！
    // 重载的好处
    // 1、减轻了起名的麻烦
    // 2、减轻了记名的麻烦

    Demo d = new Demo();
    System.out.println(d.calculate(1, 2));

    System.out.println(d.calculate(1.1, 2));

    System.out.println(d.calculate(1, 2, 3));
  }
}

class Demo {
  // calculate 方法构成了重载
  public int calculate(int a, int b) {
    return a + b;
  }
  public double calculate(double a, int b) {
    return a + b;
  }
  public int calculate(int a, int b, int c) {
    return a + b + c;
  }
}
