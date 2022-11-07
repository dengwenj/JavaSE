public class LogicalOperators {
  public static void main(String[] args) {
    // 逻辑运算符：用于连接多个条件(多个关系表达式)，最终的结果也是一个boolean值
    // 短路与 &&，短路或||，取反!
    // 逻辑与&，逻辑或|, ^ 逻辑异或
    // 对于 && 短路与而言，如果第一个条件为 false，后面的条件不再判断。
    // 对于 & 逻辑与而言，如果第一个条件为 false，后面的条件仍然会判断。
    // a ^ b：叫逻辑异或，当 a 和 b 不同时，则结果为 true，否则为 false
    // 短路或||：如果第一个条件为 true，则第二个条件不会判断，最终结果为 true，效率高
    // 逻辑或|：不管第一个条件是否为 true，第二个条件都要判断，效率低
    boolean a = true;
    boolean b = false;
    if(a && b) {
      System.out.println('进来了!')
    }
  }
}
