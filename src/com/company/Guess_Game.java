package com.company;

import java.util.Scanner;

public class Guess_Game {
    int number;
    int guess;
    int attempts=0;
    public Guess_Game()
    {
        this.number= (int) (Math.random()*100);
    }
    public static void main(String[] args) {
        Guess_Game g=new Guess_Game();
       // System.out.println("Generated number is  "+g.number);
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your guess between 1-100");
            g.guess=sc.nextInt();
            if(g.guess==g.number)
            {
                g.attempts++;
                System.out.println("Correct total guess is ==="+g.attempts);
                break;
            }
            else if(g.guess > g.number)
            {
                g.attempts++;
                System.out.println("Please guess lower");
            }
            else if(g.guess < g.number)
            {
                g.attempts++;
                System.out.println("Please guess higher");
            }
        }
    }
}
