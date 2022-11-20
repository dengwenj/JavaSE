public class Method01 {
  public static void main(String[] args) {
    // 成员方法的好处
    // 1、提高代码的复用性
    // 2、可以将实现的细节封装起来，然后共其他用户来调用
    int[][] map = {
      { 1, 2, 3 },
      { 4, 5, 6 },
      { 7, 8, 9 }
    };

    MyTools m = new MyTools();
    m.map(map);
    m.map(map);
    m.map(map);
  }
}

class MyTools {
  public void map(int[][] arr) {
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
