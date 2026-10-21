// Frequency of elements (basic logic
package Revision_DSA;

import java.util.HashMap;
import java.util.Map;

public class freq {

    public static void main(String[] args)
    {
        //create hashmap
        int freq=0;
        int[] arr={1,3,2,1,4,1,5,7,4,4};
//        <Map<Integer ,Integer> mp= new HashMap<>();
        Map<Integer,Integer> mp=new HashMap<>();

        for(int el : arr)
        {
            mp.put(el, mp.getOrDefault(el, 0) + 1);
        }
        //check once
        //use traverse

    }
}
