// factotial of a number using recusion
public class factorial 
{
    // stack building viod 
    // static void fac(int num ,int result)
    // {
    //     // termiation case
    //     if(num==0 || num==1)
    //     {
    //         System.out.println("Factorial of Number " + result);
    //         return;
    //     }
    //     // logic
    //     fac(num-1, num*result);   
         
    // }
    // stack return 
    static int fac(int num) 
    {
        // termination case 
        if(num==0 || num==1)
        {
            return 1;
        }
        int result = fac(num-1);
        return result*num;
    }
    public static void main(String[] args) 
    {
        fac(5);
    }
}
