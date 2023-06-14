//  WAP to search elements in a array

import java.util.Scanner;

public class ArraySearch 
{
    static int Sreach(int arr[],int index,int Sreach)
    {
        if(arr.length == index)
        {
            return -1;
        }
        if(arr[index] == Sreach)
        {
            return index;
        }
        return Sreach(arr, index+1, Sreach);
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
     System.out.println("Enter the element to be searched");
     int Sreach=scanner.nextInt();
     if(Sreach(arr, 0, Sreach)>=0)
     {
        System.out.println("Element is present ");
     }
     else
     {
        System.out.println("Element is not present ");
     }
   } 
}
