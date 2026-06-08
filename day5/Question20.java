//Write a program to Find largest prime factor.
package day5;

import java.util.Scanner;
public class Question20 {
      public static boolean checkprime(int a)
      {
            boolean flag = true;
            for(int i = 2; i < a; i++)
            {
                  if(a % i == 0)
                        flag = false;
            }
            if(flag == true)
                  return true;
            else
                  return false;

      }
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int x = sc.nextInt();
            if( x == 1)
            {
                  System.out.print("No prime number exists.");
            }
            else if(x<=0)
            {
                  System.out.print("Invalid input");
            }
            else
            {
                  int largest = 0;
                  for(int i = 1; i <= x; i++)
                  {

                    if( x % i == 0)
                    {

                        boolean flag = true;
                        flag = checkprime(i);
                        if(flag == true)
                              largest = i;
                    }
                  }
                  System.out.print("The largest prime factor of " + x + " is " + largest);
            }
      } 
}
