import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int a = 645757, b = 457765;
        String number = convertString(a);
        findSmallest(number, b);
    }
    
    public static String convertString(int n)
    {
        StringBuffer sb = new StringBuffer();
        boolean isNegative = false;
        if(n<0)
        {
            isNegative = true;
            n = -n;
        }
        while(n>0)
        {
            int digit = n%10;
            sb.insert(0, (char)(digit+48));
            n/=10;
        }
        if(isNegative)
            sb.insert(0, '-');
        return sb.toString();
    }
    
    public static void findSmallest(String strNum, int b)
    {
        List<String> list = new ArrayList<>();
        findCombinations(strNum, "", list);
        int nextGreater = Integer.MAX_VALUE;
        for(String str : list)
        {
            int val = convertInt(str);
            if(val>b)
            {
                if(val<nextGreater)
                    nextGreater = val;
            }
        }
        
        if(nextGreater==Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(nextGreater);
    }
    
    public static void findCombinations(String strNum, String res, List list)
    {
        if(strNum.length()==0)
            list.add(res);
        else 
        {
            for(int i=0; i<strNum.length(); i++)
            {
                char ch = strNum.charAt(i);
                String reamining = strNum.substring(0, i) + strNum.substring(i+1);
                findCombinations(reamining, res+ch, list);
            }
        }
    }
    
    public static int convertInt(String str)
    {
        boolean isNegative = false;
        int index = 0;
        int result = 0;
        if(str.charAt(0)=='-')
        {
            isNegative = true;
            index = 1;
        }
        for(int i=index; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            result = result*10 + (int)(ch-48);
        }
        return isNegative?-result:result;
    }   
}
