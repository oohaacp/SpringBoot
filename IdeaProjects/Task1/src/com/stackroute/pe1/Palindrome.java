package com.stackroute.pe1;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
      Palindrome ob=new Palindrome();
      System.out.println("Enter the number");
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
      ob.checkPalindrome(number);
    }
    public void checkPalindrome(int a)
    {
        int remainder=0, sum=0, number=a, temp=a, x=0, rem=0, add=0;
        while(number>0)  //Palindrome logic
        {
            remainder = number%10;
            sum = sum *10 + rem;
            number = number / 10;
        }
        if(sum == temp)
        {
            while(sum>0)  // Adding all the even numbers from given input
            {
                rem=sum%10;
                sum=sum/10;
                if(rem%2==0)
                {
                    add=add+rem;
                }
            }
            if(add>25)
            {
                System.out.println(temp+" "+"is palindrome and sum of even numbers is greater than 25");
            }
            else
            {
                System.out.println(temp+" "+"is palindrome and sum of even numbers is less than 25");
            }
        }

        else
        {
            System.out.println(sum+"  "+"is not a palindrome");
        }
    }
}






