// finding a pair in an array which is equal to the sum using hashing
import java.util.*;
import java.io.*;

class Gfg
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testcases = sc.nextInt();
        while(testcases-- > 0)
        {
            int sizeOfArray = sc.nextInt();
            int arr[] =  new int[sizeOfArray];  //array declaration
            
            for(int i = 0; i < sizeOfArray; i++)
             arr[i] = sc.nextInt(); //Input the array
             
            int sum = 0; 
            sum = sc.nextInt();
            
            Geeks obj = new Geeks();
            System.out.println(obj.sumExists(arr, sizeOfArray, sum));
        }
    }
}




class Geeks
{
    //Complete this function
    public static int sumExists(int arr[], int n, int sum)
    {
        HashSet<Integer> set=new HashSet<Integer>();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int temp=sum-arr[i];
            if(set.contains(temp))
            {
                ans=1;
                break;
            }
            else
            set.add(arr[i]);
            
        }
        return ans;
     }
      
    
}
