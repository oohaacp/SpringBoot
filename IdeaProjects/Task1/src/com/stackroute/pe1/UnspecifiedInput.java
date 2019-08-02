package com.stackroute.pe1;

import java.util.Scanner;

public class UnspecifiedInput
{
  public  static void main(String[] args)
  {
      int number=0, sum=0;
      System.out.println("Enter the inputs");
      Scanner scanner=new Scanner(System.in);
      while (scanner.hasNext())// hasNext() reads unspecified inputs from user
      {
          if(scanner.hasNextInt())// only integers are read
          {
              number=scanner.nextInt();
              sum=sum+number;
          }
          else
          {
              break;
          }
      }
      System.out.println(sum);
  }
}
