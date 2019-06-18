package com.example.week2test;

public class Snake extends Animal {
    private int energy =100;
    private int population =30;


    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("hisss");
        this.energy -= 3;
    }

    @Override
    void eatFood() {
        super.eatFood();
        this.energy +=5;
    }

    @Override
    void sleep() {
        super.sleep();
        this.energy += 10;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }





}
