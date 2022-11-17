import java.util.Scanner;

public class Array01 {
  public static void main(String[] args) {
    // 数组可以存放多个同一类型的数据，数组也是一种数据类型，是引用类型。数组就是一组数据
    // [] 中括号可以写在数据类型后面，也可以写在变量名后面
    // double[] arr = {1, 2, 3, 4, 5.3};
    // for(int i = 0; i < arr.length; i++) {
    //   System.out.println(arr[i]);
    // }

    // 动态初始化
    // 数组定义
    // 数据类型 数组名[] = new 数据类型[大小]
    double[] arr1 = new double[3]; // new double[3]; 分配空间
    Scanner myScanner = new Scanner(System.in);
    for(int i = 0; i < arr1.length; i++) {
      double d = myScanner.nextDouble();
      arr1[i] = d;
    }
    for(int j = 0; j < arr1.length; j++) {
      System.out.println(arr1[j]);
    }
    // 声明数组，这时 arr2 是 null
    double arr2[];
    // 分配内存空间，可以存放数据。new了过后才分配空间
    arr2 = new double[4];

    // 静态初始化
    // 数据类型 数组名[] = {元素, 元素}
    double[] arr3 = {1.2, 4.3};
  }
}
