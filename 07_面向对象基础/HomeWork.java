public class HomeWork {
  public static void main(String[] args) {
    A01 a = new A01();
    System.out.println(a.max(1.1, 2.3, 44.1));

    String[] arr = {"哈哈", "嘿嘿", "邓文杰"};
    System.out.println(a.findIndex(arr));
    
    System.out.println(a.updatePrice(120));

    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = a.copeArr(arr1);
    for(int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i]);
    }
  }
}

class A01 {
  public Double max(double... nums) {
    // Double类是可以赋 null 的
    if(nums != null && nums.length > 0) {
      double m = nums[0];
      for(int i = 0; i < nums.length; i++) {
        m = m > nums[i] ? m : nums[i];
      }
      return m;
    }
    return null;
  }

  public int findIndex(String[] strs) {
    String find = "邓文杰";
    int idx = -1;
    for(int i = 0; i < strs.length; i++) {
      if(strs[i].equals(find)) {
        idx = i;
        break;
      }
    }
    if(idx == -1) return idx;
    return idx;
  }

  public double updatePrice(double price) {
    if(price > 150) {
      return 150;
    } else if (price > 100) {
      return 100;
    }
    return price;
  }

  public int[] copeArr(int[] arr) {
    int[] arr1 = new int[arr.length];
    for(int i = 0; i < arr1.length; i++) {
      arr1[i] = arr[i];
    }
    return arr1;
  }
}