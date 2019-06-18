package com.example.week2test;

public class Tiger extends Animal {
    public int energy = 100;
    private int population = 20;

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("ROARRRR");
        this.energy-=5;
    }

    @Override
    void sleep() {
        this.energy += 5;
        super.sleep();
    }

    @Override
    void eatFood() {
        this.energy +=5;
        super.eatFood();
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }









}
