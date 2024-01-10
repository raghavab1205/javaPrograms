import java.io.*;
import java.util.*;
import java.lang.*;
public class numberPnUpsideDown
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n-1;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("#"+" ");
            }
            System.out.println(i);
        }
        System.out.println(i);
    }
}