package Array_Questions;

import java.util.Arrays;

// https://leetcode.com/problems/single-number/
public class Q2
{
  public int singleNumber(int[] nums) 
    {
       if(nums.length==0)
       {
          return 0;
       }
       if(nums.length==1)
       {
          return nums[0];
       }
       Arrays.sort(nums);  
    }
    public static void main(String[] args) 
    {
        
    }    
}
