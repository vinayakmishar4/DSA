public class ClimbinStaris
{
    public int climbStairs(int n) 
    {
        if(n == 0)
        {
            return 0;
        }
        if((n == 1) || (n == 2) || (n == 3))
        {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static void main(String[] args) 
    {
        
    }
}