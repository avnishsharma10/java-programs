//Count Total Digit in a number

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();  // taking number "n" as input
            System.out.println(new Digitcount().countDigits(n)); // prints the count of digits 
        }
    }
}


class Digitcount
{
    // complete the below function
    public static int countDigits(int n)
    {
        //int res=0;
        if(n<10) return 1;
        //countDigits(n%10);
        return 1+countDigits(n/10);
    }
}

