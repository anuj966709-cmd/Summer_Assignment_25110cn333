//Write a program to print repeated character
package day9;

import java.util.Scanner;

public class Question35 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            int a = 65;
            for(int i = 1; i <= n; i++)
            {
                  for(int j = 1; j <= i; j++)
                  {
                        System.out.print((char)a + " ");
                  }
                  a++;
                  System.out.println();
            }
      }
      
}
