//Check Palindrome using recursion

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
            
            System.out.println(new Solution().isPalin(n)?1:0);
        }
    }
}// } Driver Code Ends



class Solution
{
    static int rec(int n,int res)
    {
        if(n==0) return res;
        return rec(n/10,res*10+(n%10));
    }
    // Complete the function
    // N: input element
    static boolean isPalin(int n)
    {
        int temp = rec(n,0);
        if(temp==n) return true;
        else return false;
    }
}