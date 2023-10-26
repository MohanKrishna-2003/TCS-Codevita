import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int D = 24;
        int P = 2;
        int parts = D/P;  
        int time = 1;
        int matrix[][] = new int[parts][P]; 
        for(int i=0; i<P; i++)
        {
            for(int j=0; j<parts; j++)
            {
                matrix[j][i] = time++;
            }
        }
        int count = 0;
        for(int i=0; i<parts; i++)
        {
            boolean flag = true;
            for(int j=0; j<P; j++)
            {
                if(!isPrime(matrix[i][j]))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                count++;
        }
        System.out.println(count);
    }
    
    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
            
        if(n<=3)
            return true;
            
        if(n%2==0)
            return false;
            
        for(int i=3; i<=Math.sqrt(n); i+=2)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
