package com.Abstract;

interface DogInterface{

    void bark();



}


abstract class Dog {

    String breed;

    public void bark() {
        System.out.println("ham ham");
    }

    public abstract void poop();

}

class Doberman extends Dog {


    public void poop() {
        System.out.println("dog pooped");
    }
}

public class Abstract {

    public static void main(String[] args) {

        Doberman d = new Doberman();

        d.bark();


    }
}
