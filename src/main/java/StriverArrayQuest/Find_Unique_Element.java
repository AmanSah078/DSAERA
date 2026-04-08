package StriverArrayQuest;

public class Find_Unique_Element {
    static void finduique(int[] arr)
    {
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
            result=result^arr[i];

        }
        System.out.println(result);
    }
    public static void main(String[] args)
    {
        int[] arr={2, 3, 5, 4, 5, 3, 4};
        finduique(arr);
    }
}
