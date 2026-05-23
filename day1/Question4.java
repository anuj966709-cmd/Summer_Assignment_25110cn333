//Write a program to Count digits in a number.
import java.util.Scanner;
public class Question4 {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            int count = 0;
            boolean flag = false;
            if(n == 0)
                  flag = true;
            while(n > 0)
            {
                  n = n/10;
                  count++;
            }
            if(flag == true)
                  System.out.print("The digits in your number is: " + 1);
            else
                  System.out.print("The digits in your number is: " + count);    
      }
}
