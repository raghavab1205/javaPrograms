import java.io.*;
import java.lang.*;
import java.util.*;
public class stringPalindrome
{
    public static void main()
    {
        String reverse=" ";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            reverse=reverse+ch;
        }
        if(str.equals(reverse))
        {
            System.out.println("it is a palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}
        