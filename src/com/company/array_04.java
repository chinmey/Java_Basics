package com.company;

public class array_04 {
    public static void reverse ( int [] arr,int s,int e)
    {
        while(s<=e)
        {
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
    public static void test(int a)
    {
        a=a*2;
    }
    public static void main(String[] args) {
        int [] marks=new int[5];

        for(int i=0;i< marks.length;i++)
            marks[i]=i*2;
        for(int e:marks)
        {
            System.out.println(e);
        }

        int [][] multi_dimension_array=new int [4][2];

        for(int i=0;i<multi_dimension_array.length;i++)
        {
            for(int j=0;j<multi_dimension_array[0].length;j++)
            {
                multi_dimension_array[i][j]=i+j;
                System.out.print(multi_dimension_array[i][j]);
            }
            System.out.println();
        }
      /*
         Side note Statement
        Given an array, rotate the array to the right by k steps, where k is non-negative.
        without taking extra space
        Examples
        If an array is [1, 2, 3, 4, 5] and k = 2, the answer should be [4, 5, 1, 2, 3].
        Here, if k = 3, the answer should be: [3, 4, 5, 1, 2].
        */

        // Reverse array , Reverse first k elements, Reverse rest of elements

        int [] given ={1,2,3,4,5};

        int k=3 ;

        reverse(given,0,4);
        reverse(given,0,k-1);
        reverse(given,k,4);
        for(int e:given)
        {
            System.out.println(e);
        }
        /*
        int test_variable=10;
        test(test_variable);
        System.out.println(test_variable);
         Shows that even thou test_variable was changed it remains same here opposite to array since
         array are pass by referance
        */


    }

}
