public class HomeWork03 {
  public static void main(String[] args) {
    int num = 0;
    if(Math.random() * 10 > 7) {
      num = 2;
    } else if(Math.random() * 10 > 5) {
      num = 1;
    } else if(Math.random() * 10 > 2){
      num = 0;
    } else {
      num = (int)(Math.random() * 10);
    }

    Demo d = new Demo(num);
    System.out.println(d.shitou());
    System.out.println(d.jiandao());
    System.out.println(d.bu());
  }
}

class Demo {
  // 我出的石头剪刀布 0，1，2
  int sjb;

  Demo(String sjb) {
    this.sjb = sjb;
  }

  // 0 是石头
  public int shitou() {
    if(this.sjb == 0) {
      // 说明是平局
      return -1 
    } else if(this.sjb == 1) {
      // 说明我输了
      return 0;
    } else {
      // 说明我赢了
      return 1;
    }
  }

  // 1 是剪刀
  public int jiandao() {
    if(this.sjb == 1) {
      // 说明是平局
      return -1;
    } else if(this.sjb == 0) {
      // 说明我赢了
      return 1;
    } else {
      // 说明我输了
      return 0;
    }
  }

  // 2 是布
  public int bu() {
    if(this.sjb == 2) {
      // 说明是平局
      return -1;
    } else if(this.sjb == 1) {
      // 说明我赢了
      return 1;
    } else {
      // 说明我输了
      return 0;
    }
  }
}