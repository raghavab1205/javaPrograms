 import java.io.*;
import java.util.*;
import java.lang.*;
public class diamond
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }          
            for(int a=1;a<=i;a++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        for(int b=1;b<=n;b++)
        {
            for(int d=0;d<=b;d++)
            {
                 System.out.print(" ");
            }
            for(int c=n-1;c>=b;c--)
            {
                 System.out.print("# ");
            }
            System.out.println();
        }
    }
}