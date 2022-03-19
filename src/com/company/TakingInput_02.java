package com.company;



import java.util.Scanner;

public class TakingInput_02 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int a =sc.nextInt();
        System.out.println(a*a);


        System.out.println("Enter second number ");
        float b =sc.nextFloat();
        System.out.println(b*b);

       // System.out.println("Enter string ");
       // String st =sc.nextLine();
       // System.out.println(st);
        boolean b1=sc.hasNextInt();
       System.out.println(b1);


    }

}
