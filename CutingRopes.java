import java.util.Scanner;

public class CutingRopes
{
    static int ropes(int ropesLength,int a,int b,int c)
    {
        if(ropesLength==0)
        {
            return 0;
        }
        if(ropesLength<0)
        {
            return -1;
        }
        int A=ropes(ropesLength-a,a,b,c);
        int B=ropes(ropesLength-b,a,b,c);
        int C=ropes(ropesLength-c,a,b,c);

        int peice=Math.max(Math.max(A, B), C);
        if(peice==-1)
        {
            return -1;
        }
        return peice+1;
    }
   public static void main(String[] args) 
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the ropes length");
      int ropesLength = scanner.nextInt();
      System.out.println("Enter the A");
      int a = scanner.nextInt();
      System.out.println("Enter the B");
      int b = scanner.nextInt();
      System.out.println("Enter the C");
      int c = scanner.nextInt();
      System.out.println("Max Pecies");
      System.out.println(ropes(ropesLength,a,b,c));
   }  
}
