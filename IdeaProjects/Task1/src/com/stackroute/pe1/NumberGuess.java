package com.stackroute.pe1;
import java.util.Scanner;

public class NumberGuess
{
 public static void main(String[] args)
 {
     Scanner scanner=new Scanner(System.in);
     int number=scanner.nextInt(); //heading integer value
     if(number>=1 && number<=50)
     {
         System.out.println("Number guessed matches the original number");
     }
     else if(number<1)
     {
         System.out.println("Number guessed is less tahn original value");
     }
     else
     {
         System.out.println("Number guessed is less tahn original value");
     }

 }
}
