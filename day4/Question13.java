//Write a program to Generate Fibonacci series.
package day4;

import java.util.Scanner;
public class Question13 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of terms you want to print: ");
            int n = sc.nextInt();
            int a = 0;
            int b = 1;
            for(int i = 1; i <= n; i++)
            {
                  System.out.print(a + " ");
                  int c = a + b;
                  a = b;
                  b = c;           
            }
      }     
}
