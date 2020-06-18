//nth term of a series


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
            
            System.out.println(new Sequence().theSequence(n));
        }
    }
}
class Sequence
{
    // N: input element 
    public static int theSequence(int n)
    {
        if(n==0) return 1;
        return n+n*theSequence(n-1);
    }

}