import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int num = 12;
        int k = 3, count = 0;
        for(int i=num; i>=1; i--)
        {
            if(num%i==0)
            {
                    count++;
                    if(count==k)
                    {
                        System.out.println(i);
                        break;
                    }
            }
        }
        if(count<k)
            System.out.println(1);
    }
}
