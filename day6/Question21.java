//Write a program to Convert decimal to binary.
package day6;

import java.util.Scanner;
public class Question21{
      public static void bin(int n)
      {

            if(n==1)
            {
                System.out.print(1);
                return;
            }
            else if(n==0)
            {
                System.out.print(0);
                return;
            }    
            else if(n<0)
            {
                System.out.print("Invalid input");
            }
            else
            {
                bin(n/2);
                System.out.print(n%2);
            }
      }
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a decimal number: ");
            int x = sc.nextInt();
            bin(x);
      }   
}
