import java.util.ArrayList;
import java.util.List;

public class PascalTri
{
    public static void  generate(int numRows) 
    {
        for(int i = 0; i < numRows; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print(pascal(i,j) +"  ");
            }
            System.out.println();
        }
    }
    public static int pascal(int row, int col)
    {
        if(col==0 || col==row)
        {
            return 1;
        }
        else
        {
            return pascal(row-1, col-1) + pascal(row-1, col);
        }
    }
    public static void main(String[] args)
    {
        generate(5);
    }
}