package com.test;

import com.dengwenjie.Person;

public class Test {
  public static void main(String[] args) {
    Person person = new Person();
    System.out.println(person);

    // 不导入的话直接这样写 com.hanmeimei.Person, 相同的不可以导入多个
    com.hanmeimei.Person person1 = new com.hanmeimei.Person();
    System.out.println(person1);
  }
}
