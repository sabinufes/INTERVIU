package com.Algoritmi;

public class fibonacci {


    static int fibonacci(int n) {

        //declaram un array pentru a stoca numerele din fib
        int fibonacci[] = new int[n + 2];
        int i;

        //primele numere din sirul fibonacci sunt 0 si 1 mereu
        fibonacci[0]=0;
        fibonacci[1]=1;
        for (i=2; i<=n; i++)
        {
            /*adaugam ultimele doua numere din serie si le stocam*/

            fibonacci[i] =fibonacci[i-1] + fibonacci[i-2];



        }
        return fibonacci[n];
    }


    public static void main(String[] args) {
	//introducem numarul din sir si primim rezultatul

        int n =10;
        System.out.println(fibonacci(n));
    }
}
