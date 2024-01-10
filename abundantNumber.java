import java.io.*;
import java.util.*;
import java.lang.*;
public class abundantNumber
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a two digit number");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++)
        {
            int n=0;
            if((num/i)==(i*num))
            {
                n=i;
            }
            sum=n+n;
        }
        System.out.println(sum);
        if(sum>=num)
        {
            System.out.println("si");
        }
    }
}