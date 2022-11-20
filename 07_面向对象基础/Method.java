public class Method {
  public static void main(String[] args) {
    // 方法调用小结
    // 1 当程序执行到方法时，就会开辟一个独立的空间（栈空间，方法调用栈 -> JS 里的函数调用栈）
    // 2 当方法执行完毕 ，或者执行到 return 语句时，就会返回，返回的调用方法的地方，方法会被释放
    // 3 返回后，继续执行方法后面的代码，当 main 方法（栈）执行完毕，整个程序退出
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
