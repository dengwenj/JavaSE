import java.util.Scanner;

public class ArrayAdd {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    int[] arr1 = new int[arr.length + 1];
    for(int i = 0; i < arr.length; i++) {
      arr1[i] = arr[i];
    }
    arr1[arr1.length - 1] = 4;
    // 让 arr 指向 arr1, 那么原来 arr 数组就被销毁了
    arr = arr1;

    Scanner myScanner = new Scanner(System.in);
    while(true) {
      System.out.println("是否继续添加 y/n");
      char c = myScanner.next().charAt(0);
      if(c == 'n') {
        break;
      }

      int[] arr2 = new int[arr.length + 1];
      for(int i = 0; i < arr.length; i++) {
        arr2[i] = arr[i];
      }
      arr2[arr2.length - 1] = arr.length + 1;
      arr = arr2;
    }
    for(int i1 = 0; i1 < arr.length; i1++) {
      System.out.println(arr[i1]);
    }

    // do while 实现更好
  }
}
