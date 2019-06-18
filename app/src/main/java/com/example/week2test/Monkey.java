package com.example.week2test;

public class Monkey extends Animal{
    private int energy = 100;
    private int population =20;


    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Oooo");
        this.energy -= 4;
    }

    @Override
    void sleep() {
        super.sleep();
        this.energy += 10;
    }

    @Override
    void eatFood() {
        super.eatFood();
        this.energy +=2;
    }

    public void Play(){
        System.out.println("Oooo Oooo Oooo");
        this.energy -= 8;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
