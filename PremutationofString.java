import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.UIDefaults.LazyInputMap;

public class PremutationofString 
{
    static ArrayList<String> Permutation(String str)
    {
        // termatiation case
        if(str.length()==0)
        {
            ArrayList<String> list = new ArrayList<String>();
            list.add(" ");
            return list;
        }
        // small problem
        ArrayList<String> Flist = new ArrayList<String>();
        char first = str.charAt(0);
        ArrayList<String> list =Permutation(str.substring(1));
        for(String j:list)
        {
           for(int i=0;i<j.length();i++)
           {
           StringBuilder sb =new StringBuilder(j);
           sb.insert(i,first);
           Flist.add(sb.toString());
           }
        }
        return Flist;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The String");
        String str = scanner.next();
        System.out.println("Permutation of a String " + Permutation(str));
    }
}
