//Write a program to Print prime numbers in a range.
package day3;

import java.util.Scanner;
public class Question10 {
      public static int checkprime(int j)
      {
            boolean flag = true;
            for(int i = 2; i < j; i++)
            {
                  if(j % i == 0)
                        flag = false;
            }
            if(flag == false || j == 1)
                  return 0;
            else
                  return 1;

      }
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number of range: ");
            int x = sc.nextInt();
            System.out.print("Enter last number of the range: ");
            int y = sc.nextInt();
            System.out.print("All the prime number from " + x + " to " + y + " are: ");
            for(int i = x; i <= y; i++)
            {
                  if(checkprime(i) == 1)
                        System.out.print(i + " ");
            }
      }
}
