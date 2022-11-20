public class Method {
  public static void main(String[] args) {
    Person p = new Person();
    p.sum();
    p.sum1(10);
    System.out.println(p.sum2(100, 200));
  }
}

class Person {
  String name;
  int age;

  // public 表示方法是公开
  // void 表示方法没有返回值
  // sum() sum 表示方法名，()形参列表
  // {} 方法体，里面写执行的代码
  public void sum() {
    int sum1 = 0;
    for(int i = 1; i <= 100; i++) {
      sum1 += i;
    }
    System.out.println(sum1);
  }

  public void sum1(int n) {
    int sum = 0;
    for(int i = 0; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum);
  }

  public int sum2(int n1, int n2) {
    int res = n1 + n2;
    return res;
  }
}
