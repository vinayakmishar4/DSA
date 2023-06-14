// reverse on the string using recursion

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.Scanner;

public class RevStr
{
    
    // static void  building 
    static String Rev(String str)
    {
         // terminal case
        if(str.length()==0)
        {
            return " ";
        }
        String smalleString=str.substring(1);
        String smallResult=Rev(smalleString);
        char fristChar=str.charAt(0);
        return smallResult+fristChar;
    }
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The String");
        String str=scanner.nextLine();
        System.out.println("Reverse of the String" + Rev(str));   
    }
}