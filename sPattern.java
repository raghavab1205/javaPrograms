import java.io.*;
import java.util.Scanner;
public class sPattern
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int len=str.length();
        for(int i=1;i<=len;i++)
        {
            String s=str.substring(0,i);
            System.out.println(s);
        }
    }
}