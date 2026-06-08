//Write a program to Check Armstrong number.
package day4;

import java.util.Scanner;
public class Question15 {
      public static int power(int a, int b)
      {
            int prod = 1;
            for(int i = 1; i <= b; i++)
            {
                  prod = prod*a;
            }
            return prod;
      }
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int x = sc.nextInt();
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
                  System.out.println("Yes it is an Armstrong number");
            else
                  System.out.println("No it is not an Armstrong number");
      } 
}
