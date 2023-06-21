import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

public class ArrayvsArraylist 
{
   public static void main(String[] args)
   {
      int arr[]=new int[5];
      for(int e: arr)
      {
         System.out.println(e);
      } 
      ArrayList<Integer> list=new ArrayList<Integer>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(0,40);
      System.out.println(list);
      ArrayList<String> list2=new ArrayList<String>();
      list2.add("a");
      list2.add("b");
      list2.add("c");
      list2.remove("a");
      System.out.println(list2);
   } 
}
