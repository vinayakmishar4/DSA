// pattern in  problems

import java.util.Scanner;

public class Pattern 
{
    static void printStar(int star)
    {
        if(star == 0)
        {
            return;
        }
        System.out.print5(" * ");
        printStar(star-1);
    }
    static void printLine(int row,int star)
    {
        if(row == 0)
        {
            return;
        }
        printStar(star);
        System.out.println();
        printLine(row-1, star+1);
    }
   public static void main(String[] args) 
   {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter number");
       int row=scanner.nextInt();
       printLine(row, 1);    
   }  
}
