package com.example.week2test;

public abstract class Animal {
    public int energy = 0;

    void makeSound(){
        System.out.println("");
        energy -= 5;
    }

    void eatFood(){
        energy +=5;

    }
    void sleep(){
        energy +=10;
    }

    void play(){

    }
}
