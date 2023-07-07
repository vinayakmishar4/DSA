package Branching;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q2 
{
   static ArrayList<String> getMaze(int currentrow,int currentcol,int endrow,int endcol)
   {
      if(currentcol>endcol || currentrow>endrow)
      {
         ArrayList<String> result = new ArrayList<String>();
         return result;
      }
      if(currentcol==endcol && currentrow==endrow)
      {
         ArrayList<String> result=new ArrayList<>();
         result.add(" ");
         return result;
      }
      ArrayList<String> result=new ArrayList<>();
      ArrayList<String> rightResult = getMaze(currentrow,currentcol+1,endrow,endcol);
      for(String right : rightResult)
      {
          result.add("R "+right);
      }
      ArrayList<String> downResult = getMaze(currentrow+1,currentcol,endrow,endcol);
      for(String down : downResult)
      {
         result.add("D "+down);
      }
      return result;
   }  
   public static void main(String[] args)
   {
      ArrayList<String> result=getMaze(0,0,2,2);
      System.out.println(result);
   }  
}
