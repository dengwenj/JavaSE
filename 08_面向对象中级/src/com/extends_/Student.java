package com.extends_;

public class Student {
  public String name;
  public int age;
  private double score;

  public void setScore(double score) {
    this.score = score;
  }

  public void showInfo() {
    System.out.println(this.name + this.age + this.score);
  }
}
