package com.abhishek;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer number");
        int a = sc.nextInt();
        System.out.println("Enter second integer number");
        int b = sc.nextInt();
        System.out.println("Enter 0 for addition\nEnter 1 for subtraction\nEnter 2 for multiplication\nEnter 4 for division");
        int calculationCode = sc.nextInt();
        switch (calculationCode){
            case 0 : System.out.println(Calculator.addition(a,b));
                break;
            case 1 : System.out.println(Calculator.subtract(a,b));
                break;
            case 2 : System.out.println(Calculator.multiplication(a,b));
                break;
            case 3 : System.out.println(Calculator.division(a,b));
                break;
        }
    }

    public static int addition(int a,int b){
        return a+b;
    }

    public static int subtract(int a,int b){
        return a-b;
    }

    public static int multiplication(int a,int b){
        return a*b;
    }

    public static int division(int a,int b){
        return a/b;
    }
}
