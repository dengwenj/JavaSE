public class Array {
  public static void main(String[] args) {
    Demo d = new Demo();
    int[] arr = {1, 3, 10, 5, 6};
    d.Bubble(arr);
  }
}

class Demo {
  public void Bubble(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int temp;
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}