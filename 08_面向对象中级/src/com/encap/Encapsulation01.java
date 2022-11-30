package com.encap;

public class Encapsulation01 {
  public static void main(String[] args) {
    Person person = new Person();
    person.setName("邓文杰1666");
    System.out.println(person.getName());
    person.setAge(120);
    System.out.println(person.getAge());
    person.setSalary(50000);
    System.out.println(person.getSalary());

    Person person1 = new Person("邓文杰", 140, 50000);
    person1.info();
  }
}

class Person {
  public String name;
  private int age; // 私有
  private double salary; // 私有

  public Person() {}


  public Person(String name, int age, double salary) {
//    this.name = name;
//    this.age = age;
//    this.salary = salary;
//    我们可以将 set 方法写在构造器中，这样仍然可以验证
    this.setName(name);
    this.setAge(age);
    this.setSalary(salary);
  }

  public String getName() {
//    判断一些权限，权限够就给你返回 name
    return name;
  }

  public void setName(String name) {
    if (name.length() >= 2 && name.length() <= 6) {
      this.name = name;
      return;
    }
    System.out.println("姓名长度没有在2-6之间，给默认姓名");
    this.name = "韩梅梅";
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age >= 1 && age <= 120) {
      this.age = age;
      return;
    }
    System.out.println("年龄没有在1-120之间，给默认年龄");
    this.age = 22;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    if (salary >= 10000) {
      this.salary = salary;
      return;
    }
    System.out.println("薪水没有超过1w我给你1w");
    this.salary = 10000;
  }

  public void info() {
    System.out.println(this.name + this.age + this.salary);
  }
}
