package StriverArrayQuest;

public class Max_Consecutive_ones {
    static int findconsecutive(int[] arr)
    {
        int count=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0)
            {
                count++;
            }
            else {
                count=0;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr={1,1,0,1,1,1};
//        findconsecutive(arr);
        System.out.println(findconsecutive(arr));
    }
}
