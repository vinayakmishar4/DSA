import java.util.Scanner;

public class Q9
{
    static void sreach(int arr[],int i,int element,int count)
    {
       if(i<0)
       {
         System.out.println(count);
       }
       if(arr[i]==element)
       {
         count++;
       }
       sreach(arr, i-1, element, count);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of Array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the elements of Array");
       for(int i=0;i<n;i++)
       {
          
           arr[i]=sc.nextInt();
       }
       System.out.println("Array:- ");
       int li=arr.length-1;
       for(int i=0;i<arr.length;i++)
       {
          System.out.println(arr[i]);
       }
       System.out.println("Enter the element to be searched");
       int element=sc.nextInt();
       sreach(arr, li, element,0);
    }    
}
