package com.extends_;

public class Demo {
  public static void main(String[] args) {
    DStudent dStudent = new DStudent();
    dStudent.name = "李雷";
    dStudent.age = 22;
    dStudent.setScore(70);
    dStudent.showInfo();
    dStudent.testD();

    XStudent xStudent = new XStudent();
    xStudent.name = "韩梅梅";
    xStudent.age = 10;
    xStudent.setScore(90);
    xStudent.showInfo();
    xStudent.testX();
  }
}
