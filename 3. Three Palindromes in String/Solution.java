import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "namaynamantenet";
        int n = str.length();
        String palindromes[] = new String[3];
        for(int i=1; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                String firstSplit = str.substring(0, i);
                String secondSplit = str.substring(i, j);
                String thirdSplit = str.substring(j);
                if(isPalindrome(firstSplit) && isPalindrome(secondSplit) && isPalindrome(thirdSplit)) 
                {
                    palindromes[0] = firstSplit;
                    palindromes[1] = secondSplit;
                    palindromes[2] = thirdSplit;
                    break;
                }
            }
            if(palindromes[0]!=null)
                break;
        }
        if(palindromes[0]==null)
            System.out.println("Impossible");
        else 
        {
            for(String s : palindromes)
                System.out.println(s);
        }
    }
    public static boolean isPalindrome(String str)
    {
        int left = 0;
        int right = str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
