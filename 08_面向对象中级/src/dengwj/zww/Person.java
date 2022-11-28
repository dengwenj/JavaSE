package dengwj.zww;

import java.util.Arrays;

public class Person {
  public static void main(String[] args) {
    System.out.println("我是dengwj.zww包里面的类文件");

    int[] arr = {1, 2, 6, 4, 3, 5};
    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
