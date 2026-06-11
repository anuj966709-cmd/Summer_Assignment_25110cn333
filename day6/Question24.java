//Write a program to Find x^n without pow().
package day6;

import java.util.Scanner;
public class Question24 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter base: ");
            int x = sc.nextInt();
            System.out.print("Enter power: ");
            int n = sc.nextInt();
            int prod = 1;
            if(x==0 && n==0)
            {
                  System.out.print("Invalid input.");
                  return;
            }
            for(int i = 1; i <= n; i++)
            {
                  prod = prod*x;
            }
            System.out.print("Answer is : " + prod);
      }
      
}
