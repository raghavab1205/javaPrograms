import java.io.*;
import java.util.*;
import java.lang.String;
public class specialNumber
{
    public static void main()
    { 
        int num,sum=0,pro=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a two digit number");
        String n=sc.next();
        String l=n.substring(0,1);
        String r=n.substring(1);
        num=Integer.parseInt(n);
        int le=Integer.parseInt(l);
        int rh=Integer.parseInt(r);
        sum=le+rh;
        pro=le*rh;
        int sp=sum+pro;
        if(sp==num)
        {
            System.out.println("it is a special no");
        }
        else
        {
            System.out.println("it is not a special no");
        }
    }
}