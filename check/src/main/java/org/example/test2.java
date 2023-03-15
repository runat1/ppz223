package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
        Pet pet=context.getBean("myPet", Pet.class);
        pet.sey();
    }
}
