import java.io.*;
import java.util.Scanner;
public class palyndrome
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int len=str.length();
        String rev="";
        for(int i=len-1;len>=0;i--)
        {
            char ch=str.charAt(i);
            rev=rev+ch;
        }
        System.out.println(rev);
        if(str.equals(rev))
        {
            System.out.println("it is a palyndrome");
        }else
        {
            System.out.println("it is not a palyndrome");
        }
    }
}
