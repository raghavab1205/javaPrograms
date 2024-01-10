import java.io.*;
import java.util.*;
public class numbertriangletransposeEquil
{
    public static void main()
    {
        int i;
        int j;
        int k;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}