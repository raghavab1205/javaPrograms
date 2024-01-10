import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class floyd
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=sc.nextInt();
        int num=1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
