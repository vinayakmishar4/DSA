// paildrome or not in recusrison

import java.util.Scanner;

public class Q5 
{
    static boolean Prime(int num ,int i)
    {
       if(num<=1)
       {
         return false;
       }
       if(i==1)
       {
          return true;
       }
       if(num%i==0)
       {
          return false;
       }
       return Prime(num,i-1);
       
    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The Number");
       int num=sc.nextInt();
       if(Prime(num,num-1))
       {
          System.out.println("Prime Number");
       }
       else
       {
           System.out.println("Not Prime Number");
       }
    }
}
