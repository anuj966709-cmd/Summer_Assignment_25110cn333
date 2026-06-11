//Write a program to Convert binary to decimal.
package day6;

import java.util.Scanner;
public class Question22 {
      public static int power(int x, int y)
      {
            int prod = 1;
            for(int i =  1; i <= y; i++)
            {
                  prod = prod*x;
            }
            return prod;
      }
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the binary number: ");
            int n = sc.nextInt();
            int sum = 0;
            int a = 0;
            while(n > 0)
            {
                  int rem = n % 10;
                  sum = sum + rem*power(2,a);
                  n = n/10;
                  a++;
            }
            System.out.print("Decimal number is: " + sum);
      }
}
