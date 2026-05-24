//Write a program to Check whether a number is palindrome.
package day2;
import java.util.Scanner;
public class Question8 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            int m = n;
            int rem = 0;
            int rev = 0;
            while(m > 0)
            {
                  rem = m % 10;
                  rev = rev*10 + rem;
                  m = m/10;
            }
            if(rev == n)
                  System.out.print("Number is palindrome");
            else
                  System.out.print("Number is not a palindrome");
      }
      
}
