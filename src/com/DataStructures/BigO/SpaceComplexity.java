package com.DataStructures.BigO;

public class SpaceComplexity {

    public void greet(String[] names){

         //O(n) space
        String[] copy= new String[names.length];


        for(int i=0; i < names.length; i++)
            System.out.println("hi" + names[i]);
    }


}
