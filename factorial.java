// factorial using recursion
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
            System.out.println(new Solution().factorial(n));
        }
    }
}
// } Driver Code Ends

class Solution
{
    // complete the function
    // N: input element
    static int factorial(int N)
    {
        // find and return the factorial of N
        if(N==1 || N==0 )
        return 1;
        else
        return N*factorial(N-1);
    }
}