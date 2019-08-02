package com.stackroute.pe1;

import java.util.Scanner;

public class Vowel
{public static void main(String args[])
{
    Vowel ob=new Vowel();
    System.out.println("Enter the string for checking");
    Scanner scanner=new Scanner(System.in);
    String str=scanner.nextLine();  // Reading the String input
    int len=str.length();     // Length gives the size of string
    ob.check(str,len);
}
    public void check(String str,int len)
    {
        for(int i=0;i<len;i++)
        {
            char input=str.charAt(i);  // Individual character is taken by charAt()

            if((input>='a' && input<='z') || (input>='A' && input<='Z'))
            {
                if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u')
                {
                    System.out.print("Vowel ");
                }
                else
                {
                    System.out.print("Consonant");
                }
            }
            else
            {
                System.out.print("Input is not a letter");
            }
        }
    }
}