public class Switch01 {
  public static void main(String[] args) {
    double score = 88.5;

    switch((int)(score / 60)) {
      case 1:
        System.out.println("合格");
        break;
      case 0:
        System.out.println("不合格");
        break;
      default:
        System.out.println("输入有误");
    }
  }
}
