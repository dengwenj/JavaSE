### 数组、排序和查找

**数组**

* 数组可以存放多个同一类型的数据，数组也是一种数据类型，是引用类型。数组就是一组数据
* [] 中括号可以写在数据类型后面，也可以写在变量名后面
* 数组创建后，如果没有赋值，有默认值，int、byte、short、long -> 0，double、float -> 0.0，char -> \u0000，boolean -> false，String -> null
* 数组属于引用类型，数组型数据是对象

```java
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
```

**数组分配和翻转**

```java
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
```

**数组扩容**

```java
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
```

**冒泡排序**

```java
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
```

**二维数组**

```java
public class TwoDimensional {
  public static void main(String[] args) {
    // 二维数组定义是: int[][]
    int[][] arr = {
      {0, 1, 2},
      {3, 4, 5},
      {6, 7, 8}
    };

    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length; j++) {
        System.out.println(arr[i][j]);
      }
    }
  }
}
```

