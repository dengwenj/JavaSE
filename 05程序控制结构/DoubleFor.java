import java.util.Scanner;

public class DoubleFor {
  public static void main(String[] args) {
    // int class1 = 3; // 班
    // int student = 5; // 每个班学生
    // double allClassScore = 0; // 所有班级分数
    // int jg = 0; // 及格人数
    // Scanner myScanner = new Scanner(System.in);

    // for(int i = 1; i <= class1; i++) {
    //   double sum = 0; // 每个班的成绩
    //   for(int j = 1; j<= student; j++) {
    //     System.out.println("请输入第" + i + "个班级第" + j + "个学生的成绩: ");
    //     double score = myScanner.nextDouble();
    //     if(score >= 60) {
    //       jg++;
    //     }
    //     sum += score;
    //   }
    //   allClassScore += sum;
    //   System.out.println(i + "班的总分数是: " + sum + ", 平均分数是: " + (sum / student));
    // }
    // System.out.println("所有班级总分是: " + allClassScore + ", 所有平均分是: " + 
    //   (allClassScore / (class1 * student)) + "及格人数为: " + jg);

    // // 99 乘法表
    // for(int i = 1; i <= 9; i++) { // 前面那个数
    //   String s = "";
    //   for(int j = 1; j <= i; j++) {
    //     s += j + "×" + i + "=" + (i * j) + " ";
    //   }
    //   System.out.println(s);
    // }

    // 金字塔
    int total = 5;
    for(int i = 1; i <= total; i++) { // 每一层
      String s = "";
      String s1 = "";
      for(int k = 1; k <= total - i; k++) { // 空格
        s1 += " ";
      }
      for(int j = 1; j <= 2 * i - 1; j++) {
        if(j == 1 || j == 2 * i - 1 || i == total) {
          s += "*";
        } else {
          s += " ";
        }
      }
      System.out.println(s1 + s);
    }
    
  }
}
