package Revision_DSA;

import java.util.HashMap;

public class First_Non_Repeating_Element {
    static void findthefirstnonrepeating(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        //first loop for find the freq of eleement
        for(int i=0;i<arr.length;i++) {
            if (map.containsKey(arr[i])) //yadi arr of i ka element is store  in the map as a key then add +1
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                //ek baar to aaya hi hoga na
                map.put(arr[i], 1);
            }
        }

        for(int i=0;i<arr.length;i++)

        {
            if(map.get(arr[i])==1)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,1,2,3,4};
        findthefirstnonrepeating(arr);
    }
}
