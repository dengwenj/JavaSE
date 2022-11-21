public class Demo03 {
  public static void main(String[] args) {
    // 斐波那锲数  1 1 2 3 5 8 13
    Test test = new Test();
    System.out.println(test.t(5));
  }
}

class Test {
  public int t(int n) {
    if(n <= 2) {
      return 1;
    }
    return t(n - 1) + t(n  - 2);
  }
}

// t(4) -> 3 + t(3) -> 2   5
// t(3) -> 2 + t(2) -> 1   4
// t(2) -> 1 + t(1) -> 1   3
//             2