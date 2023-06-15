// cout number of zero in number

import java.util.Scanner;

public class Q2 
{
    static int zero(int number)
    {
        if(number==0)
        {
            return 0;
        }
        int count=zero(number/10);
        if(number%10==0)
        {
            return count+1;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scanner.nextInt();
        System.out.println("Number of zeros");
        System.out.println(zero(number));
    }
}
