//Write a program to Find nth Fibonacci term.
package day4;

import java.util.Scanner;
public class Question14 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the nth term: ");
            int x = sc.nextInt();
            if(x <= 0)
            {
                  System.out.print("You entered invalid term.");
                  return;
            }
            int a = 0;
            int b = 1;
            for(int i = 1; i < x; i++)
            {
                  int c = a+b;
                  a = b;
                  b = c;
            }
            System.out.print("The nth term is: " + a);
      }    
}
