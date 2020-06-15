//first Non-repeating Character

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Repeatation().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}


class Repeatation
{
    static char nonrepeatingCharacter(String str)
    {
        Character a=' ';
        Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else
            map.put(str.charAt(i),1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
             {a=entry.getKey();
             break;}
            else if(entry.getValue()!=1)
            a='$';
        }
        return a;
    }
}

