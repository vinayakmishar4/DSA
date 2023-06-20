import java.util.Scanner;

public class EvenandOdd
{
   static int[] sum(int number,int count)
   {
      if(number==0)
      {
         int result[]=new int[2];
         return result;
      }
      // samll problem
      int arr[]=sum(number/10,count+1);
      int digit=number % 10;
      if(count%2!=0)
      {
          arr[0]+=digit;
      }
      else
      {
         arr[1]+=digit;
      }
      return arr;
   }
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number");
      int number=sc.nextInt();   
      int arr[]=sum(number,0);
      System.out.println("Sum of the odd number is "+arr[0]);
      System.out.println("Sum of the even number is "+arr[1]);
   }  
}
