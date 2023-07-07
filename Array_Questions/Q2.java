package Array_Questions;

import java.util.Arrays;

// https://leetcode.com/problems/single-number/
public class Q2
{
  public int singleNumber(int[] nums) 
    {
       int xor = 0;
       for(int num:nums)
       {
         xor ^= num;
       }
       return xor;
    }
    public static void main(String[] args) 
    {
        
    }    
}
