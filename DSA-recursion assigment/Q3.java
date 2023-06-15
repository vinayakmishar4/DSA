//sum of n natural numbers

import java.util.Scanner;

public class Q3 
{
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) 
    {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=scanner.nextInt();
       System.out.println("Sum of "+n+" natural numbers is "+sum(n));
    }
}
