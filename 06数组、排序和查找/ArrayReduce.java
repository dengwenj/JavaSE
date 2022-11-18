import java.util.Scanner;

public class ArrayReduce {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    while(true) {
      Scanner myScanner = new Scanner(System.in);
      System.out.println("是否缩减 y/n");
      char c = myScanner.next().charAt(0);
      if(c == 'n') break;

      if(arr.length == 1) {
        System.out.println("不能再进行缩减了!");
        break;
      }

      int[] arr1 = new int[arr.length - 1];
      for(int i = 0; i < arr1.length; i++) {
        arr1[i] = arr[i];
      }
      arr = arr1;
    }
    for(int i1 = 0; i1 < arr.length; i1++) {
      System.out.println(arr[i1]);
    }
  }
}
