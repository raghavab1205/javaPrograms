import java.io.*;
import java.util.*;
public class numbertriangle
{
    public static void main()
    {
        int i;
        int j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}