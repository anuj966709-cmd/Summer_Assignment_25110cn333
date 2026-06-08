//Write a program to Print factors of a number. 
package day5;

import java.util.Scanner;
public class Question19 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int x = sc.nextInt();
            System.out.print("The factors of " + x + " are = ");
            for(int i = 1; i <= x; i++)
            {
                  if(x % i ==0)
                        System.out.print(i + ", ");
            }

      }
      
}
