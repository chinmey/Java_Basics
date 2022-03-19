package com.company;

@FunctionalInterface
/* function interface are interafce with only 1 function */
interface Demo{
    void method();
}

public class misc_11 {
    public static void main(String[] args) {
        // Anonymous class
        Demo d=new Demo() {
            @Override
            public void method() {
                System.out.println("Anonymous function");
            }
        };
        d.method();

        // Lambda Expression
        Demo d2=()->{
            System.out.println("Lambda Expression");
        };
        d2.method();

    }
}
