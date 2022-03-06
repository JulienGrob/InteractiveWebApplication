package com.company;

import java.util.Scanner;
public class QuadraticEquation {
    private double a=0;
    private double b=0;
    private double c=0;
    private double D=0;

    public double getD() {
        return D;
    }

    public void setD(double d) {
        D = d;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void calculSolutions(){
        Scanner saisieUtilisateur = new Scanner((System.in));
        System.out.println("Please put the value for x^2");
        a = saisieUtilisateur.nextInt();
        System.out.println("Please put the value for x:");
        b = saisieUtilisateur.nextInt();
        System.out.println("Please put the last value:");
        c = saisieUtilisateur.nextInt();
        D= (Math.pow(b,2)-4*a*c);
        if (D>0){
            double x1,x2;
            x1= (-b-Math.sqrt(D))/(2*a);
            x2= (-b+Math.sqrt(D))/(2*a);
            System.out.println("Your solutions are: "+x1+" and "+x2);
        }
        else if (D==0){
            double x1;
            x1= -b/(2*a);
            System.out.println("Your only solution is: "+x1);
        }
        else if (D<0) {
            System.out.println("Your solutions are imaginary");
            double imaginaryPart1, realPart,imaginaryPart2;
            realPart=-b/(2*a);
            imaginaryPart1=-(Math.sqrt(-D))/(2*a);
            realPart=-b/(2*a);
            imaginaryPart2=(Math.sqrt(-D))/(2*a);
            System.out.println("Your solutions are: "+realPart+"+"+imaginaryPart1+"i"+" and "+ realPart +" + " + imaginaryPart2+"i");
        }

    }
}
