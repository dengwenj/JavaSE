### 数组、排序和查找

**数组**

* 数组可以存放多个同一类型的数据，数组也是一种数据类型，是引用类型。数组就是一组数据
* [] 中括号可以写在数据类型后面，也可以写在变量名后面

```java
public class Array01 {
  public static void main(String[] args) {
    // 数组可以存放多个同一类型的数据，数组也是一种数据类型，是引用类型。数组就是一组数据
    double[] arr = {1, 2, 3, 4, 5.3};
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
```

