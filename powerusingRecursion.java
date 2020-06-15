//Power using recursion;

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int p = sc.nextInt();
            
            System.out.println(new Power().RecursivePower(n,p));
        }
    }
}


class Power
{
    static int RecursivePower(int n,int p)
    {
        if(p==0)
        return 1;
        return n*RecursivePower(n,p-1);
    }
}
