package com.stackroute.pe1;
import java.util.Scanner;

public class NumberLoop {

    public static void main(String[] args)
    {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number");
            int number = scan.nextInt();

            for (int i = 0; i < number; i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    System.out.print(i + 1);
                }
            }

        }

    }




