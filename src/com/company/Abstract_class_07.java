package com.company;


/*
An abstract class is one without any implementation it is expected that the child
will provide the implementation if not it should also be declared as abstract
We can't extend multiple abstrat classes as multiple inheritance is not supported JAVA.
Abstract class can have non-abstract method
 */

abstract class Example{
    public Example(){
        System.out.println("COnstructor");
    };
    abstract void print();

}

class Child extends Example{
    void print()
    {
        System.out.println("Hello");
    }
}

public class Abstract_class_07 {
    public static void main(String[] args) {
        Example e=new Child();
        e.print();
    }

}
