public class Demo02 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for(int i = 0; i < arr.length; i++) {
      // 1-100 的整数
      int n = (int)(Math.random() * 100) + 1;
      System.out.print(n + " ");
      arr[i] = n;
    }
    System.out.println();
    int sum = 0;
    int max = arr[0];
    int maxIdx = 0;
    boolean isSpecificNum = false;
    for(int j = 0; j < arr.length; j++) {
      System.out.print(arr[arr.length - 1 - j] + " ");
      sum += arr[j]; // 总和
      if(max < arr[j]) { // 最大值
        max = arr[j];
        maxIdx = j;
      }
      if(arr[j] == 12) {
        isSpecificNum = true;
      }
    }
    System.out.println("平均值: " + (sum / arr.length));
    System.out.println("最大值: " + max);
    System.out.println("最大值索引: " + maxIdx);
    if(isSpecificNum) {
      System.out.println("里面有特定的数");
    } else {
      System.out.println("里面没有特定的数");
    }
  }
}