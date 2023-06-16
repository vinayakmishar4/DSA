// paildrome number or not in recusion

import java.util.Scanner;

public class Q7 
{
   static int  paildrome(int num,int sum)
   {
      if(num==0)
      {
         return sum;
      }
      int re=num%10;// 1234,123,12,1
      sum=sum*10+re;// 5,9,12,14,15
      return paildrome(num/10,sum);    
   }
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      if(paildrome(num,0)==num)
      {
        System.out.println("Paildrome");
      }
      else
      {
        System.out.println("Not Paildrome");
      }
   }    
}
