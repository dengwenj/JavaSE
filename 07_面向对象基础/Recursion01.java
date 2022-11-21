public class Recursion01 {
  public static void main(String[] args) {
    T t = new T();
    t.test(4);
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
}