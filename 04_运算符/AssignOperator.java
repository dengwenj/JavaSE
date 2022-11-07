public class AssignOperator {
  public static void main(String[] args) {
    // 赋值运算符: 赋值运算符就是将某个运算后的值，赋给指定的变量
    // 赋值运算符特点
    // 1、运算顺序从右往左 int num = a + b + c;
    // 2、赋值运算符的左边只能是变量，右边可以是变量、表达式、常量值
    // 3、复合赋值运算符会进行类型转换
    byte b = 2; //
    b += 3; // 等价 b = (byte)(b + 2); 默认会转换为 int，底层做了 (byte)(b + 2);
    b++; // b = (byte)(b + 1); 
  }
}
