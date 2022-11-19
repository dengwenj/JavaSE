public class BubbleSort {
  public static void main(String[] args) {
    // 冒泡排序：就是依次比较，前面的数和后面的数比较，大的话就交换位置
    int[] arr = {111, 22, 33, 44, 55};
    int len = arr.length;
    int temp;

    // 轮数
    for(int i = 0; i < len; i++) {
      System.out.println("进来了" + (i + 1) + "次");
      boolean flag = false;

      // 次数
      for(int j = 0; j < (len - 1) - i; j++) {
        if(arr[j] > arr[j + 1]) {
          flag = true;
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      if(!flag) break;
    }

    for(int i1 = 0; i1 < len; i1++) {
      System.out.println(arr[i1]);
    }
  }
}
