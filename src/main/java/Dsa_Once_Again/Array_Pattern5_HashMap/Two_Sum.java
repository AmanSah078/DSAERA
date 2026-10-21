package Dsa_Once_Again.Array_Pattern5_HashMap;

import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target=9;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//reversef
for(int i=0;i<arr.length;i++)
{
    int current = arr[i];
    int required=target-current;
    if(hm.containsKey(required))
    {
       System.out.println(hm.get(required));
       System.out.println(i);
    }
    hm.put(current,i);
}
    }
}
