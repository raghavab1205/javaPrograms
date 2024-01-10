import java.io.*;
import java.util.*;
import java.lang.*;
public class Kpattern
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        for(int a=1;a<=n;a++)
        {
            for(int b=n;b>=a;b--)
            {
                System.out.print("@"+" ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
                System.out.print("@"+" ");
           }
            System.out.println();
        }
    }
}