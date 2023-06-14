// sum of digit of a number

import java.util.Scanner;

public class SumofDigits 
{
    static void Sod(int num,int sum)
    {
        // terminate case 
        if(num==0)
        {
            System.out.println("Sum of digits of a number :- " + sum);
            return;
        }
        // logic
        int re=num%10;
        sum=sum+re;
        Sod(num/10,sum);
    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a Number");
       int number=sc.nextInt();
       Sod(number,0);   
    }   
}
