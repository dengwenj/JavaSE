public class Demo04 {
  public static void main(String[] args) {
    int[][] map = new int[8][7];
    //  0 代表没有障碍物 1代表有

    for(int i = 0; i < map.length; i++) {
      for(int j = 0; j < map[i].length; j++) {
        if(i == 0 || i == map.length - 1) {
          map[i][j] = 1;
        } else {
          map[i][0] = 1;
          map[3][1] = 1;
          map[3][2] = 1;
          map[i][map[i].length - 1] = 1;
        }
      }
    }

    // for(int i = 0; i < map.length; i++) {
    //   for(int j = 0; j < map[i].length; j++) {
    //     System.out.print(map[i][j] + " ");
    //   }
    //   System.out.println();
    // }
    
    System.out.println("============================");
    T t1 = new T();
    t1.findWay(map, 1, 1);

    for(int i = 0; i < map.length; i++) {
      for(int j = 0; j < map[i].length; j++) {
        System.out.print(map[i][j] + " ");
      }
      System.out.println();
    }
  }
}
// 1代表障碍物，2代表可以走，3代表死路，0带代表没有障碍物
class T {
  public boolean findWay(int[][] map, int i, int j) {
    if(map[6][5] == 2) {
      return true;
    }
    
    if(map[i][j] == 0) {
      // 假设可以走
      map[i][j] = 2;

      if(findWay(map, i + 1, j)) { // 下
        return true;
      } else if(findWay(map, i, j + 1)) { // 右
        return true;
      } else if(findWay(map, i - 1, j)) { // 上
        return true;
      } else if(findWay(map, i, j - 1)) { // 做
        return true;
      } else {
        map[i][j] = 3;
        return false;
      }
    } else { // map[i][j] = 1, 2, 3
      return false;
    }
  }
}