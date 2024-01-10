import java.io.*;
import java.util.*;
import java.lang.*;
public class switchString
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine();
        int len=str.length();
        int a=0,e=0,i=0,o=0,u=0,v=0;
        char ch=' ';
        for(int d=0;d<len;d++)
        {
             ch=str.charAt(d);
        }
        switch(ch)       
        {
            case 'a':
            case 'A':
            a++;
            v++;
            break;
            case 'e':
            case 'E':
            e++;
            v++;
            break;
            case 'i':
            case 'I':
            i++;
            v++;
            break;
            case 'o':
            case 'O':
            o++;
            v++;
            break;
            case 'u':
            case 'U':
            u++;
            v++;
            break;
        }
        System.out.println("the number of vovels in the string are: "+v);
        if(a>=1)
        {
            System.out.println("the number of a/A's present is: "+a);
        }
        if(e>=1)
        {
            System.out.println("the number of e/E's present is: "+e);
        }
        if(i>=1)
        {
            System.out.println("the number of i/I's present is: "+i);
        }
        if(o>=1)
        {
            System.out.println("the number of o/O's present is: "+o);
        }
        if(u>=1)
        {
            System.out.println("the number of u/U's present is: "+u);
        }
    }
}




            