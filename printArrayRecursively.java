//printArrayRecursively

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
            int N = Integer.parseInt(read.readLine());
            int arr[] = new int[N];
            String str[] = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(str[i]);
                
            new PrintArray().printArrayRecursively(arr, N);
            System.out.println();
        }
        
    }


class PrintArray
{

    public static void printArrayRecursively(int arr[], int n)
    {
       if(n==0) return;
       printArrayRecursively(arr, n-1);
       System.out.print(arr[n-1]+" ");
    }
    
    
    
}