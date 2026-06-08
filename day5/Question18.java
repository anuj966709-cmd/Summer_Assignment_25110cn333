//Write a program to Check strong number.
package day5;

import java.util.Scanner;
public class Question18 {
      public static int fact(int x)
      {
            if(x == 0 || x == 1) return 1;
            return x*fact(x-1);
      }
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int x = sc.nextInt();
            if(x == 0)
            {
                  System.out.print("This is not a strong number.");
                  return;
            }
            int y = x;
            int sum = 0;
            while(y > 0)
            {
                  int rem = y % 10;
                  sum = sum + fact(rem);
                  y = y/10;
            }
            if(sum == x)
                  System.out.print("This is a strong number.");
            else
                  System.out.print("This is not a strong number.");
      }  
}
