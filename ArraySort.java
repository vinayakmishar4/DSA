// WAP to short an array

import java.util.Scanner;

public class ArraySort 
{
    static boolean isArray(int []arr,int index)
    {
        if(arr.length-1==index)
        {
            return true;
        }
        if(arr[index]>arr[index+1])
        {
            return false;
        }
        return isArray(arr,index+1);
    }
   public static void main(String[] args) 
   {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the size of the array");
     int n=scanner.nextInt();
     int arr[]=new int[n];
     System.out.println("Enter the elements of the array");
     for(int i=0;i<n;i++)
     {
        arr[i]=scanner.nextInt();
     }
     System.out.println("The array is");
     for(int i=0;i<arr.length;i++)
     {
        System.out.println(arr[i]);
     }
     if(isArray(arr, 0))
     {
        System.out.println("The array is sorted");
     }
     else
     {
        System.out.println("The array is not sorted");
     }
   }  
}
