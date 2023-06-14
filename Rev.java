// Revesre by recurison
public class Rev 
{
  //stack void building
  static void Rev(int sum , int num)
  {
        if(num==0)
        {
            System.out.println("Revesre of Number = " + sum);
            return;
        }
        int re=num%10;
        sum=sum*10+re;
        Rev(num/10, sum);
  }
  // stack return
  // static int Rev(int num)
  // {
  //    if(num==0)
  //    {
  //       return 0;
  //    }
  //    int sum=Rev(num/10);
  //    int re=num*10;
  //    sum=sum*10+re;
  //    return sum;
  // }
  public static void main(String[] args) 
  {
      Rev(673, 0);
  }
}
