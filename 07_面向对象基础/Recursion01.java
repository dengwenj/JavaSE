public class Recursion01 {
  public static void main(String[] args) {
    T t = new T();
    t.test(4);

    System.out.println(t.f(5)); // 120
  }
}

class T {
  public void test(int n) {
    // if(n > 2) {
    //   test(n - 1);
    // }
    // System.out.println(n); // 2 3 4

    if(n > 2) {
      test(n - 1);
    } {
      System.out.println(n); // 2
    }
  }

  public int f(int n) {
    if(n == 1) {
      return 1;
    }
    return f(n - 1) * n;
  }
}