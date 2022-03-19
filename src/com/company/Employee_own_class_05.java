package com.company;

public class Employee_own_class_05 {
    String name; // attribute
    int age;
    float salery;

    public Employee_own_class_05(String n, int a, float s) // constructor
    {
        this.name=n;
        this.age=a;
        this.salery=s;
    }

    public void Employee_Age_Salery () // Function or Method
    {
        System.out.println(this.salery/this.age);
    }

    public static void main(String[] args) {
        Employee_own_class_05 Ram=new Employee_own_class_05("Ram",23,80000.00f);
        System.out.println(Ram.name+Ram.age+Ram.salery);
        Ram.Employee_Age_Salery();

    }

}


