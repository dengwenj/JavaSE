public class HomeWork04 {
  public static void main(String[] args) {
    PassObject p = new PassObject();
    p.printAreas(new Circle(2), 5);
  }
}

class Circle {
  double radius; // 圆的半径

  Circle(double radius) {
    this.radius = radius;
  }

  public double findArea(int radius) {
    // 面的面积
    return 3.14 * radius * radius;
  }
}

class PassObject {
  public void printAreas(Circle c, int times) {
    for(int i = 1; i <= times; i++) {
      System.out.print(i + " ");
      System.out.print(c.findArea(i));
      System.out.println();
    }
  }
}