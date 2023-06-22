package BackTracking_Practice_Questions;

import java.lang.annotation.Retention;

public class WordSerach 
{
    public boolean exist(char[][] board, String word) 
    {
       for (int i = 0; i < board.length; i++)
       {
        for (int j = 0; j < board[0].length; j++)
        {
            if(word.charAt(0)==board[i][j] && exist(board,i,j,0,word))
            {
              
                return true;
            }
        }
       }
       return false;
    }
    public boolean exist(char[][] board,int i,int j,String word,int pos)
    {
        if(pos==word.length())
        {
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || word.charAt(pos)==board[i][j])
        {
            return false;
        }
        char temp=board[i][j];
        board[i][j] = '*';
        if(exist(board,i+1,j,word,pos+1) || exist(board,i-1,j,word,pos+1) || exist(board,i,j+1,word,pos+1) || exist(board,i,j-1,word,pos+1))
        {
            
            return true;
        }
        board[i][j] = temp;
        return false;
    }
    public static void main(String[] args) 
    {
        
    }
}
