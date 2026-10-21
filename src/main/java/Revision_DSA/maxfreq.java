package Revision_DSA;

import java.util.HashMap;
import java.util.Map;

//Find the element with maximum frequency in an array
public class maxfreq {
    public static void main(String[] args)


    {
Map<Integer,Integer> mp=new HashMap<>();
        int[] arr={1,1,2,1,4,4,4};
        int maxFreq=0;
        int anskey=-1;
        int freq=0;
        // from the we can know the freq of array
        for(int e1 : arr)
        {
         mp.put(e1,mp.getOrDefault(e1,0)+1);
        }




        for(var e : mp.entrySet())
        {

            if(e.getValue() > maxFreq)   // 👈 ye hi condition hai
            {
                maxFreq = e.getValue(); //highest value store
                anskey = e.getKey();//highest value store of which key
            }

        }

        System.out.println(anskey);
    }
}
