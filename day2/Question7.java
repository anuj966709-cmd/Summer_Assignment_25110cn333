//Write a program to Find product of digits.
package day2;
import java.util.Scanner;
public class Question7 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            int prod = 1;
            int rem = 0;
            while(n > 0)
            {
                  rem = n % 10;
                  prod = prod * rem;
                  n = n/10;
            }
            System.out.println("The product of digits of number is: " + prod);
      }
}
