package com.example.week2test;

public class ZooTest {
    public static void main(String[] args) {
        Tiger mike = new Tiger();
        mike.makeSound();
        System.out.println( mike.getEnergy());


        Monkey George = new Monkey();
        George.makeSound();
        System.out.println(George.getEnergy());

        Snake medusa = new Snake();
        medusa.makeSound();
        System.out.println(medusa.getEnergy());

       George.Play();
        System.out.println(George.getEnergy());

    }
}
