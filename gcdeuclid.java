//gcd euclid 

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
            String str[] = read.readLine().trim().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            
            System.out.println(new Solution().GCD(a, b));
        }
    }
}


class Solution
{
    
    public static int GCD(int a, int b)
    {
        // find and return GCD of two numbers;
        if(b==0) return a;
        return GCD(b,a%b);
    }
}