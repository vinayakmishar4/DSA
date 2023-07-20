public class Sudoku_Solver 
{
     final int MAX_SIZE=9;
     public boolean isRow(int row, int value)
     {
        for(int column=0;column<MAX_SIZE;column++)
        {
            if(board[row][column]==value)
            {
                return true;
            }
        }
        return false;
     }
     public boolean isColum(int column, int value)
     {
        for(int row=0;row<MAX_SIZE;row++)
        {
            if(board[row][column]==value)
            {
                return true;
            }
        }
        return false;
     }
     public boolean isSubGrid(int row,int column, int value)
     {
        int stratRow=row-row%3;
        int stratColumn=column-column%3;
        for(int i=stratRow;i<stratRow+3;i++)
        {
          for(int j=stratColumn;j<stratColumn+3;j++)
           {
              if(board[i][j]==value)
              {
                 return true;
              }
           }
        }
        return false;
     }
     public boolean isValidSudoku(int row,int column,int value)
     {
        // check if value is persont in row columun,subgird
        return !isRow(row, value) && !isColum(column, value) &&  !isSubGrid(row, column, value);
     }
    char[][] board;
     public boolean solveSudoku(int row,int column)
     {
         if(column==MAX_SIZE)
         {
            row=row+1;
            column=0;
         }
         if(row==MAX_SIZE)
         {
            return true;
         }
         if(board[row][column]!='.')
         {
            return solveSudoku(row, column+1);  
         }
         for(int i=1;i<=9;i++)
         {
            if(isValidSudoku(row, column,(char)(i+'0')))
            {
                board[row][column]=(char)(i+'0');
                boolean result=solveSudoku(row, column+1);
                if(result)
                {
                   return true;
                }
                board[row][column]='.';
            }
         }
         return false;
     }
    public void solveSudoku(char[][] board)
    {
        this.board=board;
        solveSudoku(0,0);
    }  
}
