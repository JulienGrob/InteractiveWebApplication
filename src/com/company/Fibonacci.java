package com.company;

public class Fibonacci {
    public void suiteFibonacci(int b){// b is the number of element you want to calcul
    int fo = 0;
    int f1 = 1;
    int [] suiteFibo = new int [b+2];
    suiteFibo[0]=fo;
    suiteFibo[1]=f1;
    System.out.println(suiteFibo[0]);
    System.out.println(suiteFibo[1]);
    int a = 1;
    for (int i=1; i<b-1;i++){
       int fi= suiteFibo[a]+suiteFibo[a-1];
        System.out.println(fi);
       a+=1;
       suiteFibo[a]=fi;
    }
}
}
