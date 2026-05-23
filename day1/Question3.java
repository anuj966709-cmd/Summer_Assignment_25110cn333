//Write a program to Find factorial of a number.
import java.util.Scanner;
public class Question3 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            int product = 1;
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++)
            {
                  product = product * i;
            }
            System.out.print("factorial of " + n + " is " + product);
      }
}
