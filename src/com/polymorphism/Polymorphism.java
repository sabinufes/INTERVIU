package com.polymorphism;

class Bird {

    public void sing() {
        System.out.println("cip cirip");

    }

}


class Cintezoi extends Bird {
    public void sing() {
        System.out.println("muu!!");

    }


}

public class Polymorphism {
    public static void main(String[] args) {


        Bird b = new Bird();
        b.sing();
        Cintezoi cintezoi = new Cintezoi();
        cintezoi.sing();
    }
}
