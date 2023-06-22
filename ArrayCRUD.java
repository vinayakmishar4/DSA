import java.util.Scanner;

import org.junit.runner.notification.StoppedByUserException;
class ArrayOperatio
{
    int arr[];
    int currentSize;
    ArrayOperatio(int capcity)
    {
        arr = new int[capcity];
        currentSize = 0;
    }
    void add(int element,int value)
    {
       if(element>currentSize)
       {
            throw new RuntimeException("Postion cant be Greater than Current Size");
       }
       if(currentSize ==arr.length)
       {
           throw new RuntimeException("Array Full");
       }
       for(int i=currentSize-1; i>=element; i--)
       {
          arr[i+1] = arr[i];
       }
       arr[element] = value;
       currentSize++;
       System.out.println("Element Added: ");
    }
    void print()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    void update(int Serach,int Update)
    {
        int element=serach(Serach);
        if(element==-1)
        {
           return;
        }
        else
        {
           arr[element]=Update;
           System.out.println("Element Updated");
           print();
        }
    }
    int serach(int element)
    {
        // linear search
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                System.out.println("Element is Found");
                return i;
            }
        }
        System.out.println("Element is Not Found");
        return -1;
    }
    void remove(int element)
    {
       if(currentSize==0)
       {
          throw new RuntimeException("Array is Empty");
       }
       int index=serach(element);
       if(index==-1)
       {
         return;
       }
       else
       {
         for(int i=index; i<currentSize-1; i++)
         {
            arr[i]=arr[i+1];
         }
         arr[currentSize-1]=0;
         currentSize--;
         System.out.println("Element Removed");
         print();
       }
    }
    void sort()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array Sorted");
        print();
    }
    void max()
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Max element is: "+max);
        print();
    }
    void min()
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Min element is: "+min);
        print();
    }
}
public class ArrayCRUD 
{

   public static void main(String[] args) 
   {
      ArrayOperatio ap= new ArrayOperatio(10);
      Scanner scanner = new Scanner(System.in);    
      while(true)
      {
        System.out.println("1.Add element");
        System.out.println("2.Update element");
        System.out.println("3.Delete element");
        System.out.println("4.print");
        System.out.println("5.Serach");
        System.out.println("6.Sort");
        System.out.println("7.Max elements");
        System.out.println("8.Min elements");
        System.out.println("9.Exit");
        System.out.println("Enter your choice: ");
        int choice =scanner.nextInt();
        switch(choice)
        {
            case 1:
            ap.add(0,100);
            ap.add(1, 200);
            ap.add(0, 0);
            ap.add(1,200);
            ap.add(2, 200);
            ap.add(3,300);
            break;
            case 2:
            ap.update(200, 2000);
            break;
            case 3:
            ap.remove(100);
            break;
            case 4:
            ap.print();
            break;
            case 5:
            ap.serach(200);             
            break;
            case 6:
            ap.sort();
            break;
            case 7:
            ap.max();
            break;
            case 8:
            ap.min();
            break;
            default:
            case 9:
            System.out.println("Thanks for Array");
            System.out.println("Worng Choice: ");
            break;
        }
      }
   } 
}
