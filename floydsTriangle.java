import java.io.*;
import java.lang.*;
import java.util.*;
public class floydsTriangle
{
    public static void main()
    {
        int row=5;
        int num=1;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
        }
    }
}