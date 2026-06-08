//Write a program to Find LCM of two numbers.
package day3;
import java.util.Scanner;
public class Question12 {
      public static int min(int x, int y)
      {
            if(x > y)
                  return y;
            else
                  return x;
      }
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first natural number: ");
            int x = sc.nextInt();
            System.out.print("Enter second natural number: ");
            int y = sc.nextInt();
            int z = min(x,y);
            int gcd = 1;
            for(int i = 1; i <= z; i++)
            {
                  if(x % i == 0 && y % i == 0 )
                        gcd = i;
            }
            int lcm = (x * y)/gcd;
            System.out.println(lcm);

      }
}
