import java.util.ArrayList;
import java.util.Scanner;

public class Subsequnces
{
   static ArrayList<String> Sub(String str)
   {
      // terminate case
      if(str.length()==0)
      {
         ArrayList<String> list = new ArrayList<String>();
         list.add("");
         return list;
      }
      // samll problem 
      char fristChar = str.charAt(0);
      ArrayList<String> result=new ArrayList<String>();
      ArrayList<String> list=Sub(str.substring(1));
      for(String s : list)
      {
         // not incuded
         result.add(s);
         // include
         result.add(fristChar+s);
      }
      return result;
   } 
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String");
      String str=sc.nextLine();
      ArrayList<String> list=Sub(str);
      System.out.println(list);
   }
}