// pattern with diffrent aproching

import java.util.Scanner;

public class PatternAnotherAprocah 
{
   static void printStar(int star)
   {
       if(star == 0)
       {
          return;
       }
       System.out.println(" * ");
       printLine(star-1);
   }
   static void printLine(int row)
   {
    if(row==0)
    {
        return;
    }
    printLine(row-1);
    printLine(row);
    System.out.println(); 
   }
   public static void main(String[] args) 
   {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the Number");
      int row=scanner.nextInt();
      System.out.println(row);
   }  
}
