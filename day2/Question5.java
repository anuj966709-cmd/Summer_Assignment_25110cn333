//Write a program to Find sum of digits of a number.
package day2;
import java.util.Scanner;

public class Question5 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            int sum = 0;
            while(n > 0)
            {
                  int rem = n % 10;
                  sum = sum + rem;
                  n = n/10;
            }
            System.out.println("The sum of digits of number is: " + sum);

      }
}
