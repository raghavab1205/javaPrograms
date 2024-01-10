import java.io.*;
import java.util.*;
import java.lang.*;
public class RightAngledTriangleUpsideDown
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("@"+" ");
            }
            System.out.println();
        }
    }
}