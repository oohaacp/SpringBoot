package com.stackroute.pe1;

import java.util.Scanner;

public class StringRepeat
{
    public static void main(String args[])
        {
            StringRepeat ob = new StringRepeat();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the string");
            String str1 = scanner.next();
            System.out.println("Enter the integer");
            int number = scanner.nextInt();
            ob.repeat(str1, number);  // Calling method through object
        }

        public void repeat(String str1, int n)
        {
            String str2=str1.substring(str1.length()-n);
            for(int i=0;i<n;i++)
            {
                str1 += str2;  // String Concatenation
            }
            System.out.print(str1);
        }
    }



