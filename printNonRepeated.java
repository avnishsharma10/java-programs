//print non repeated elements

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- >0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n=Integer.parseInt(str[0]);
            int arr[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
                
            ArrayList<Integer> v = new Hashing().printNonRepeated(arr, n);
            
            for(int i=0;i<v.size();i++){
                System.out.print(v.get(i)+" ");
            }
            
            System.out.println();
        }
    }
}




class Hashing
{
    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        ArrayList<Integer> ans= new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            map.put(arr[i],1);
        }
      
        
         for (int i = 0; i < n; i++) 
           {
               if (map.get(arr[i]) == 1)
                ans.add(arr[i]);
           }
        return ans;
    }
}

