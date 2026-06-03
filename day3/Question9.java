//Write a program to Check whether a number is prime.
package day3;
import java.util.Scanner;
public class Question9 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int x = sc.nextInt();
            boolean flag = true;
            for(int i = 2; i < x; i++)
            {
                  if(x % i == 0)
                        flag = false;
            }
            if(flag == false || x == 1)
                  System.out.print("Number is not prime");
            else
                  System.out.print("Number is prime");
      }

}
