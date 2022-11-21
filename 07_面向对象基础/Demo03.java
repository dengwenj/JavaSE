public class Demo03 {
  public static void main(String[] args) {
    // 斐波那锲数  1 1 2 3 5 8 13
    Test test = new Test();
    // System.out.println(test.t(5));

    System.out.println(test.hh(1)); // 1534
  }
}

class Test {
  public int t(int n) {
    if(n <= 2) {
      return 1;
    }
    return t(n - 1) + t(n  - 2);
  }

  // day = 10 时有 1 个桃子
  // day = 9 时有 （day10 + 1） * 2 = 4
  // day = 8 时有（day9 + 1） * 2 = 10
  // 前一天的桃子 = （后一天的桃子 + 1） * 2
  public int hh(int day) {
    // 第十天
    if(day == 10) { // 第一天是刚开始的个数
      return 1;
    }
    return (hh(day + 1) + 1) * 2;
  }
}

// hh(1) * 2 + 1 // 15
// hh(2) * 2 + 1 // 7
// hh(3) * 2 + 1 // 3
// 1

// t(4) -> 3 + t(3) -> 2   5
// t(3) -> 2 + t(2) -> 1   4
// t(2) -> 1 + t(1) -> 1   3
//             2