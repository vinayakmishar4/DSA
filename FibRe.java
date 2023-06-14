// fibanncoi series on by Recursion

import java.util.Scanner;

public class FibRe 
{
    static int a=0,b=1,c;
    static void fibanncoi(int num)
    {
        
         if(num>=1)
         {           
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            fibanncoi(num-1);        
        }

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number = ");
        int num=sc.nextInt();
        System.out.println("Fibonnacci Series :- ");
        fibanncoi(num);
    }
}
