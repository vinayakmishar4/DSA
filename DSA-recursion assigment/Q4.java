// 1/1^1 + 2 / 2 ^2 + 3 / 3^3 

import java.util.Scanner;

public class Q4 
{
    static double power(int num)
    {
         return (num/Math.pow(num, num));
    }
    static double Module(int number)
    {
        if(number==0)
        {
            return 0; 
        }
        return power(number) + Module(number-1);
    }
    public static void main(String[] args) 
    {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter a number");
       int number=scanner.nextInt();
       System.out.println(Module(number));
    }
}
