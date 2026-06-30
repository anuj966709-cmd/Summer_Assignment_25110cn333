//Write a program to print reverse number triangle.
package day9;

import java.util.Scanner;

public class Question34 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++)
            {
                  for(int j = 1; j <= n-i+1; j++)
                  {
                        System.out.print(j + " ");
                  }
                  System.out.println();
            }
      }
      
}
