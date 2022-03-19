package com.company;

/*
Interface and classes are like contract one provides method other implemets
One class can implements multiple interfaces
Interfaces allow us to do runtime polymorphism
we can have variable in interface but they should be initiased
Default method can also be used but their definition needs to be given in interface
 */
interface person{
    int speed=20;
    void runner();
    default void batsman(){
        System.out.println("Normal Cricketer");
    }
}
interface cricketer{
    void player();
    default void batsman(){
        System.out.println("Trained Cricketer");
    }
}

class Athlete implements person,cricketer{
    public void runner()
    {
        System.out.println("Running!!"+this.speed);
    }
    public void player()
    {
        System.out.println("I am a Player!!");
    }
   public void batsman(){
        person.super.batsman();
   }
}

class Lazy implements  person{
    public void runner(){
        System.out.println("Not running!!");
    }
}

public class Interface_08 {
    public static void main(String[] args) {
        person p=new Athlete();
        p.runner();
        person q= new Lazy();
        q.runner();

    }
}
/*
why multiple interface is supported but multiple inheritance is not ?
In interface we never define function so the resposibilty will always be on class
to define it thus no error can come , default need to be specifically defined in child incase
same is implemented example is above
In inheritance 2 classes can have same function defined than child doesn't know which
function to run thus not allowed.
 */

