public class Var {
  public static void main(String[] args) {
    // 变量相当于内存只中一个数据存储空间的表示
    // 类型 + 名称 + 值
    String name = "dengwenjie";
    char gender = '男'; // 字符型
    int age = 22;
    double score = 99.5;

    System.out.println("信息：");
    System.out.println(name);
    System.out.println(gender);
    System.out.println(age);
    System.out.println(score);

    // int num = 1l; 从long转换到int可能会有损失
    long num1 = 1L;
    System.out.println(num);
  }
}
 