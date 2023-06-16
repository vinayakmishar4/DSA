// amstrong number in java

import java.util.Scanner;

public class Q6 
{
    static int Amstrong(int number,int len)
    {
        if(number==0)
        {
            return len;
        }
        len+=Math.pow(number%10,3);
        return Amstrong(number/10,len);
    }
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        {
            System.out.println("Enter a number");
            int number=scanner.nextInt();
            if(Amstrong(number, 0)==number) 
            { 
               System.out.println(number+" is an amstrong number");
            }
            else
            {
                System.out.println(number+" is not an amstrong number");    
            }
        }
    }
}
