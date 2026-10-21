package Dsa_Once_Again.Hash_Map_Pattern;

import java.util.HashMap;

public class First_Non_Repeating {
    static void firstnonrepeating(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);  //arr[i] means key mein 1 value add kr do
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                System.out.println("First Non Repeating Element is " + arr[i] );
                return;
            }
        }

    }
        public static void main(String[] args)
        {
           // int[] arr={4,5,1,2,0,4};
            int[] arr={8,3,8,2,3,5};
            firstnonrepeating(arr);
        }
    
}
