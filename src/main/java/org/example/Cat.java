package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println("Кот спит !!");
    }
    public void eat(){
        System.out.println("Кот ест !!");
    }
    @SayMeow
    public void jump(){
        System.out.println("Кот скачет как конь !!");
    }

    public void crush() throws Exception {
      //  throw new Exception("Кот сломался");
        System.out.println("Кот разбит, но не сломлен");
    }
}
