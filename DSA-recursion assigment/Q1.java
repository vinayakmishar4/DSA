// power of a number using recusion
import java.util.Scanner;

public class Q1 
{
    static int Power(int base,int power)
    {
        // termination case
        if(power==0)
        {
            return 1;
        }
        if(power==1)
        {
            return base;
        }
        // logic         
        return base*Power(base,power-1);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Base of a Number");
        int base=sc.nextInt();
        System.out.println("Enter The Power of Number");
        int power=sc.nextInt();
        System.out.println("Power of Number");
        System.out.println(Power(base, power));
    }
}
