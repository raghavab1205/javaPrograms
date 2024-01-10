import java.io.*;
import java.util.*;
import java.lang.*;
public class numberPn
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int i=1;
        System.out.println(i);
        for(;i<=n-1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("#"+" ");
            }
            System.out.println(i+1);
        }
    }
}