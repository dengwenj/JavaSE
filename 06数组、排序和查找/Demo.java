public class Demo {
  public static void main(String[] args) {
    String[] s = new String[]{"hh", "xx", "gg"}; // 这样写可以的

    int[] arr = {10, 22, 5, 9};
    int temp;
    for(int i = 0; i < arr.length - 1; i++) { // 轮数
      boolean falg = false;
      for(int j = 0; j < arr.length - 1 - i; j++) {
        if(arr[j] > arr[j + 1]) {
          falg = true;
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      if(!falg) break;
    }
    for(int k = 0; k < arr.length; k++) {
      System.out.print(arr[k] + " ");
    }
  }
}
