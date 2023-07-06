package Array_Questions;

import java.util.Arrays;

//https://leetcode.com/problems/majority-element/
public class Q1 
{
    public int majorityElement(int[] nums) 
    {
       Arrays.sort(nums);
       return nums[nums.length/2];   
    }
    public static void main(String[] args) 
    {

    }   
}
