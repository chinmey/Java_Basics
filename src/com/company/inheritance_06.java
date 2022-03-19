package com.company;

class Base{
    int x;

    Base()
    {
        System.out.println("I am in Base");
    }

    Base (int x)
    {
        this.x=x;
    }

}

class Derived extends Base{
    int y;
    Derived()
    {
        /*
         super() this is present in derived constructor implictilty thus it calls with no
         parameter constructor of Parent
        */
        System.out.println("I am in Derived");
    }
    Derived(int y)
    {
        this.x=y*y;
    }

    void fun()
    {
        System.out.println("fun");
    }
}
/*
 If child implement same method as parent , than child's method will run it is
 called method overriding or late binding

 Method overloading on other hand represent early binding
*/
public class inheritance_06 {
    public static void main(String[] args) {
        //Base b = new Base();

        Derived d = new Derived();
        Derived g=new Derived(4);
        System.out.println(g.x);
     /*
     This is valid in java a base class referance can refer to any of child reverse
      not true
     */
        Base ref=new Derived();

        /*
        ref.fun()  ==> Not valid
        ref since it was made with Base can call all methods which are overidden in
        derived methods(and derived class methods are run)
        methods specific to Derived can't be run
         */
    }

}
