package com.company;

import java.util.Scanner;

/*
Java has 2 time of Exception:
Checked ==> checked by compiler and programmer is forced to put command in try catch
            or throws .For example FilereadException etc
Unchecked ==> found at runtime for example nullpoint exception.All C++ exception were
              unchecked.
If a method has Throws expection in it , it means user needs to handle that while using it
Throw ==> For showing error to user
Finally ==> Code that runs regardless of if exception was encoutered or not
            it is used to close connection etc

 */

public class Exception_10 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        while(true)
        {
            try{
                Scanner s=new Scanner(System.in);
                int k=s.nextInt();
                System.out.println("Value is "+ arr[k]);

            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
