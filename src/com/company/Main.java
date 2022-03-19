package com.company;



public class Main {

    int a =3;

     int add (int a,int b)
    {
        return a+b;
    }
     static  int multiple (int a)
     {
         return a*a;
     }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello WOrld!");
        Main m =new Main();
        System.out.println(m.a);

        System.out.println(m.add(3,4));
        System.out.println(multiple(4));
    }
}
