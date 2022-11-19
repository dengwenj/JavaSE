import java.util.Scanner;

// 插入
public class Demo01 {
  public static void main(String[] args) {
    int[] arr = {10, 20, 40, 55};

    Scanner myScanner = new Scanner(System.in);
    System.out.println("请输入一个数");
    int insertNum = myScanner.nextInt();
    
    // 方法一: 扩容，创建一个新的数组
    // int[] arr1 = new int[arr.length + 1];
    // for(int j = 0; j < arr.length; j++) {
    //   arr1[j] = arr[j];
    // }

    // int temp;
    // for(int i = 0; i < arr1.length; i++) {
    //   if(num < arr1[i]) {
    //     temp = arr1[i];
    //     arr1[i] = num;

    //     // k = i + 1 往后移一个
    //     int temp1; // 后一个
    //     int temp2 = arr1[i + 1]; // 前一个
    //     for(int k = i + 1; k < arr1.length; k++) {
    //       temp1 = arr1[k];
    //       if(k == i + 1) {
    //         arr1[k] = temp;
    //       } else {
    //         arr1[k] = temp2;
    //       }
    //       temp2 = temp1;
    //     }
    //     break; 
    //   }
    //   if(i == arr.length - 1) arr1[arr1.length - 1] = num;
    // }

    // 方法二: 先把这个插入数的索引找出来
    int idx = -1;
    for(int i = 0; i < arr.length; i++) {
      if(insertNum < arr[i]) {
        idx = i;
        break;
      }
      // 说明没有找到
      if(idx == -1) idx = arr.length;
    }

    int[] arr1 = new int[arr.length + 1];
    for(int j = 0, k = 0; j < arr1.length; j++) {
      if(j != idx) {
        arr1[j] = arr[k];
        k++; // 这个 k++ 用的太秒了!!!!!!!!!
      } else { // 要插入的位置
        arr1[idx] = insertNum;
      }
    }
    arr = arr1;
    for(int l = 0; l < arr.length; l++) {
      System.out.print(arr[l] + " ");
    }
  }
}
