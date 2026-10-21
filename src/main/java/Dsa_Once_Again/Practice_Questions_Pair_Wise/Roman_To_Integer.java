package Dsa_Once_Again.Practice_Questions_Pair_Wise;

import java.util.HashMap;

public class Roman_To_Integer {
    static void romantointeger(String str)
    {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
int sum=0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        for(int i=0; i<str.length()-1; i++)
        {
            char ch = str.charAt(i);

            if(map.get(ch) < map.get(str.charAt(i+1)))
            {
                sum = sum - map.get(ch);
            }
            else
            {
                sum = sum + map.get(ch);
            }
        }
        sum = sum + map.get(str.charAt(str.length()-1));
    System.out.println(sum);

    }
    public static void main(String[] args) {
        String str="IX";
        romantointeger(str);


    }
}
