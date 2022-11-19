public class TwoDimensional {
  public static void main(String[] args) {
    // 二维数组定义是: int[][]
    // int[][] arr = {
    //   {0, 1, 2},
    //   {3, 4},
    //   {6, 7, 8}
    // };

    // for(int i = 0; i < arr.length; i++) {
    //   for(int j = 0; j < arr[i].length; j++) {
    //     System.out.print(arr[i][j] + " ");
    //   }
    //   System.out.println();
    // }

    // 动态初始化
    // 类型[][] 数组名 = new 类型[大小][大小]
    // int arr[][] = new int[2][3]
    // int arr1[][] = new int[2][3];
    // arr1[1][1] = 20;
    // for(int i1 = 0; i1 < arr1.length; i1++) {
    //   for(int j1 = 0; j1 < arr1[i1].length; j1++) {
    //     System.out.println(arr1[i1][j1]);
    //   }
    // }

    // int arr[][]; 先声明二维数组
    // arr = new int[2][3]; 再开空间

    // 创建二维数组，一个有3个一维数组，但是每个一维数组还没有开数据空间
    int[][] arr = new int[3][];
    for(int i = 0; i < arr.length; i++) {
      // 给每个一维数组开辟空间，不开空间为 null
      arr[i] = new int[i + 1];
      for(int j = 0; j < arr[i].length; j++) {
        // 赋值
        arr[i][j] = i + 1;
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
