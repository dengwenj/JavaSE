public class Yhsj {
  public static void main(String[] args) {
    int[][] arr = new int[5][];

    for(int i = 0; i < arr.length; i++) {
      // 给每个一维数组开辟空间
      arr[i] = new int[i + 1];
      for(int j = 0; j < arr[i].length; j++) {
        if(j == 0 || j == arr[i].length - 1) {
          arr[i][0] = 1;
          arr[i][arr[j].length - 1] = 1;
        } else {
          // 杨辉三角规律
          // 1 
          // 1 1 
          // 1 2 1 
          // 1 3 3 1 
          // 1 4 6 4 1 
          arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
        }
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
