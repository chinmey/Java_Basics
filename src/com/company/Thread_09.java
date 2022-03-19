package com.company;

/*
Parellelism ==> Doing the task at same time and often at different cores/machines.

Concurrency ==> Doing more than one task in similar time period by
               but on same core

Example ==> Ek hotel h , usme ek waiter h now waiter serves one person and while
           that person is eating or waiting we start serving other person and so on ==>Concurreny

           2 waiter h ==> Parallelism
Thread can be made by extending Thread class or implemeting Runnable interface

 */

import java.util.concurrent.TimeUnit;

class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread One Started" + this.getId());
        // Introducing delay of 1 s
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
        }
        System.out.println("Thread one stopped!");
    }
}

class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread Two Started");

        System.out.println("Thread Two stopped!");
    }
}

class ThreadRunner implements Runnable{
  public void run(){
      System.out.println("Thread using Interface Working");
  }
}




public class Thread_09 {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();

        ThreadRunner runner=new ThreadRunner();
        Thread t3=new Thread(runner);
        t3.start();

        /*
         .setPriority :We can set priority of threads but os always takes it as a request
         and it is not guarnteed that it will abide by it
         .join : Ensures one thread is run first and post its end other is run
         .sleep : Used to interupt a thread

        */

    }
}
