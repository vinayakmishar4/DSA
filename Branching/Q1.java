package Branching;

import java.lang.reflect.Array;
import java.util.ArrayList;

// Dice Borad Game problem
 public class Q1
 {
    public static void outcomes(int[] Dice, String s,int goal,int sum,ArrayList<String> list)
    {
        if(sum>goal)
        {
            return;
        }
        if(sum==goal)
        {
            list.add(s);
        }
        for(int i=0;i<Dice.length;i++)
        {
            String t1=s + Integer.toString(Dice[i]);
            int t2=sum + Dice[i];

            outcomes(Dice, t1, goal, t2, list);
        }
    }
    public static void main(String[] args) 
    {
       ArrayList<String> list = new ArrayList<String>();
       int[] Dice={1,2,3,4,5,6};
       int goal=7;
       outcomes(Dice, "", goal, 0, list);
       System.out.println(list);    
    }
 }
