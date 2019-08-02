package com.stackroute.pe1;

import java.util.Scanner;

public class EvenOdd
{

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner (System.in);
            int number= scanner.nextInt();
            if(number>20&&number<30) {
                if(number%2==0) {
                    System.out.println("Jerry");
                }
                else
                {
                    System.out.println("Tom");
                }
            }
            else
            {
                System.out.println("not in range");
            }

//System.out.println((n>20&&n<=0)?((n%2)==0?"Jerry":"Tom"):"not in range");

        }
    }



