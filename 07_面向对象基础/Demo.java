public class Demo {
  public static void main(String[] args) {
    A a = new A();
    if(a.isOdd(2)) {
      System.out.println("是奇数");
    } else {
      System.out.println("是偶数");
    }

    char[][] arr = a.d(3, 4, '☆');
    // for(int i = 0; i < arr.length; i++) {
    //   for(int j = 0; j < arr[i].length; j++) {
    //     System.out.print(arr[i][j]);
    //   }
    //   System.out.println();
    // }
  }
}

class A {
  public boolean isOdd(int n) {
    return n % 2 != 0;
  }

  public char[][] d(int n1, int n2, char c) {
    char[][] arr = new char[n1][n2];
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length; j++) {
        arr[i][j] = c;
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    return arr;
  }
}
