package Ramzan_DSA_Challenge;

public class Leaders_oF_Array {
    static void findleaders(int[] arr)
    {
        int maxright=arr[arr.length-1];
        System.out.println(maxright);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>maxright)
            {
                maxright=arr[i];
                System.out.println(maxright);
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr={16,17,4,3,5,2};
        findleaders(arr);
    }
}
