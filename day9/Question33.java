//Write a program to print reverse star pattern
package day9;

import java.util.Scanner;
public class Question33 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++)
            {
                  for(int j = 0; j <= n-i; j++)
                  {
                        System.out.print("* ");
                  }
                  System.out.println();
            }
      }

      
}
