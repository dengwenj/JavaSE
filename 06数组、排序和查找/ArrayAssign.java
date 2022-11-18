public class ArrayAssign {
  public static void main(String[] args) {
    // 基本数据类型赋值，这个值就是具体的数据，而且相互不影响
    // int n1 = 2;
    // int n2 = n1;
    // n2 = 20;
    // System.out.println(n2);
    // System.out.println(n1);

    // // 数组在默认情况下是引用传递，赋的值是地址
    // int[] arr1 = {1, 2, 3};
    // int[] arr2 = arr1;
    // arr2[0] = 100;
    // for(int i = 0; i < arr1.length; i++) {
    //   System.out.println(arr1[i]);
    // }

    // // 创建一个新的数组 arr4, 开辟新的空间 new 就会开辟新的空间，在堆中
    // int[] arr3 = {100, 200, 300};
    // int[] arr4 = new int[arr3.length];
    // for(int i1 = 0; i1 < arr4.length; i1++) {
    //   arr4[i1] = arr3[i1];
    // }
    // arr4[0] = 1000;
    // for(int i2 = 0; i2 < arr3.length; i2++) {
    //   System.out.println(arr3[i2]);
    // }
    // for(int i3 = 0; i3 < arr4.length; i3++) {
    //   System.out.println(arr4[i3]);
    // }

    // 数组翻转
    // int[] arr = {11, 22, 33, 44, 55, 66};
    // int[] arr1 = new int[arr.length];
    // for(int i = 0; i < arr1.length; i++) {
    //   arr1[i] = arr[(arr1.length - 1) - i];
    // }
    // for(int i1 = 0; i1 < arr1.length; i1++) {
    //   System.out.println(arr1[i1]);
    // }

    int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
    int temp;
    for(int i2 = 0; i2 < arr3.length / 2; i2++) {
      temp = arr3[arr3.length - 1 - i2];
      arr3[arr3.length - 1 - i2] = arr3[i2];
      arr3[i2] = temp;
    }

    for(int i3 = 0; i3 < arr3.length; i3++) {
      System.out.println(arr3[i3]);
    }
  }
}
