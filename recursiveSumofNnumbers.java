//recursive Sum of N numbers


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            System.out.println(new Sum().recursiveSum(n));
        }
    }
}


class Sum
{
    // Complete the function
    // N: input element
    public static int recursiveSum(int n)
    {
        if(n==0) return 0;
        return n+recursiveSum(n-1);
    }
}