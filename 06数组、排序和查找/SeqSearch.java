import java.util.Scanner;

public class SeqSearch {
  public static void main(String[] args) {
    String[] arr = {"邓文杰", "韩梅梅", "李银河"};

    Scanner myScanner = new Scanner(System.in);
    String name = myScanner.next();

    int idx = -1;
    for(int i = 0; i < arr.length; i++) {
      if(name.equals(arr[i])) {
        System.out.println("找到了" + name);
        idx = i;
        break;
      }
    }
    if(idx == -1) {
      System.out.println("没有找到" + name);
    }
  }
}
