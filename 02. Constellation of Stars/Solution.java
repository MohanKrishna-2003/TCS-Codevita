import java.util.*
public class Main 
{
    public static void main (String[] args) 
    {
        char matrix[][] = { 
            { '*', '.', '*', '#', '*', '*', '*', '#', '*', 
              '*', '*', '#', '*', '*', '*', '.', '*', '.' }, 
            { '*', '.', '*', '#', '*', '.', '*', '#', '.', 
              '*', '.', '#', '*', '*', '*', '*', '*', '*' }, 
            { '*', '*', '*', '#', '*', '*', '*', '#', '*', 
              '*', '*', '#', '*', '*', '*', '*', '.', '*' } 
        }; 
        
        printStars(matrix);
    }
    
    public static void printStars(char[][] matrix)
    {
        int rows = 3;
        int columns = matrix[0].length;
        for(int i=0; i<columns; i++)
        {
            if(matrix[0][i]=='#' && matrix[1][i]=='#' && matrix[2][i]=='#')
            {
                System.out.print('#');
            }
            
            else if(matrix[0][i]=='.' && matrix[1][i]=='.' && matrix[2][i]=='.')
            {
                continue;
            }
            
            else 
            {
                char a1, a2, a3, b1, b2, b3, c1, c2, c3;
                a1 = matrix[0][i];
                a2 = matrix[0][i+1];
                a3 = matrix[0][i+2];
                b1 = matrix[1][i];
                b2 = matrix[1][i+1];
                b3 = matrix[1][i+2];
                c1 = matrix[2][i];
                c2 = matrix[2][i+1];
                c3 = matrix[2][i+2];
                
                if(a2=='*' && b1=='*' && b2=='*' && b3=='*' && c1=='*' && c3=='*' && a1=='.' && a3=='.' && c2=='.')
                {
                    System.out.print('A');
                    i+=2;
                }
                
                if(a1=='*' && a2=='*' && a3=='*' &&  b1=='*' && b2=='*' && b3=='*' && c1=='*' && c2=='*' && c3=='*')
                {
                    System.out.print('E');
                    i+=2;
                }
                
                if(a1=='*' && a2=='*' && a3=='*' && b2=='*' && c1=='*' && c2=='*' && c3=='*' && b1=='.' && b3=='.')
                {
                    System.out.print('I');
                    i+=2;
                }
                
                if(a1=='*' && a2=='*' && a3=='*' &&  b1=='*' && b3=='*' && c1=='*' && c2=='*' && c3=='*' && b2=='.')
                {
                    System.out.print('O');
                    i+=2;
                }
                
                if(a1=='*' && a3=='*' && b1=='*' && b3=='*' && c1=='*' && c2=='*' && c3=='*'&& a2=='.' && b2=='.')
                {
                    System.out.print('U');
                    i+=2;
                }
            }
        }
    }
}
