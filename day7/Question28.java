//Write a program to Recursive reverse number.
package day7;

import java.util.Scanner;
public class Question28 {
      public static int revNum(int n, int rev) {
            if (n == 0)
                return rev;
            return revNum(n / 10, rev * 10 + n % 10);
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int rev = revNum(n, 0);
            System.out.println("Reversed number = " + rev);
      }   
}
