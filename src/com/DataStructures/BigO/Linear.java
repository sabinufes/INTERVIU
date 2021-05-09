package com.DataStructures.BigO;

public class Linear {


    public void log(int[] numbers, String[] names) {

        //O(n) n = size of input
        for(int i =0; i< numbers.length; i++) //O(n)
            System.out.println(numbers[i]);

      for (String name : names)   //O(m)
          System.out.println(name);

    }
}
