public class PowerofTwo
{
   public boolean isPowerOfTwo(int n) 
    {
        if(n==0 || n==1) 
        {
            return true;
        }
        if(n%2==0)
        {
            return isPowerOfTwo(n/2);
        }
        return false;  
    }
   public static void main(String[] args) 
   {
       
   }    
}
