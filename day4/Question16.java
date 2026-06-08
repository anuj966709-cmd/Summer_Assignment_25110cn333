//Write a program to Print Armstrong numbers in a range.
package day4;

import java.util.Scanner;
public class Question16 {
      public static int power(int a, int b)
      {
            
            int prod = 1;
            for(int i = 1; i <= b; i++)
            {
                  prod = prod*a;
            }
            return prod;
      }

      public static boolean checkarmstrong(int x)
      {
            int count = 0;
            int z = x;
            while(z > 0)
            {
                  z = z/10;
                  count++;
            }
            int sum = 0;
            int y = x;
            while(y > 0)
            {
                  int rem = y % 10;
                  sum = sum + power(rem,count);
                  y = y/10;
            }
            if(sum == x)
                  return true;
            else
                  return false;

      }
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number of the range: ");
            int x = sc.nextInt();
            System.out.print("Enter last number of the range: ");
            int y = sc.nextInt();
            for(int i = x; i <= y; i++)
            {
                  if(checkarmstrong(i) == true)
                        System.out.print(i + " ");
            }
      }  
}
