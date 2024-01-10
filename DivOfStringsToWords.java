import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class DivOfStringsToWords
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        String str=sc.nextLine();
        int l=str.length();
        char ch;
        for(int i=0;i<l;i++)
        { 
            ch=str.charAt(i);
            if(ch==' ')
            {
                char c=str.charAt(i+1);
                System.out.print(ch);
                System.out.println();
                i=i+1;
            }
        }
    }
}