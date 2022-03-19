package com.company;

import java.util.Arrays;
import java.util.Locale;

public class String_03 {
    public static void main(String[] args) {
        String class_Hoti=new String("Chinmey");
        System.out.println(class_Hoti);
        String special_support_java="Chinmey";
        System.out.printf("%s",special_support_java);
        System.out.println();
// String is immutable can't be changed , when we change its referance change in memory it is still same
        String name="Random";
        System.out.println(name.length()+" "+name.toLowerCase()+" "+name.substring(0,3)+" "+
                name.replace('R','s'));

        System.out.println(name.endsWith("om")+" "+name.charAt(1)+" "+name.indexOf('o')+" "+name+
                " "+name.equalsIgnoreCase("RanDOM"));


    }
}
