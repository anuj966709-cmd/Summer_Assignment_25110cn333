//Write a program to Count set bits in a number.
package day6;

import java.util.Scanner;
public class Question23 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the decimal number: ");
            int n = sc.nextInt();
            if(n < 0)
            {
                  System.out.print("Please enter positive number only.");
                  return;
            }
            int count = 0;
            while(n > 0)
            {
                  int rem = n % 2;
                  if(rem == 1)
                  {
                        count++;
                  }
                  n = n/2;
            }
            System.out.print(count);
      }    
}
