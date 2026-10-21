package Dsa_Once_Again.Frequency_Array_Pattern_5.Revision;

public class targetsum {
    static void findthetarget(int[] arr, int target)
    {
        int sum=0;
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            if(arr[right]>target)
            {
                right--;

            }
            else {
                left++;
            }
            sum=arr[left]+arr[right];
            if(sum==target)
            {
                System.out.print(arr[left]+" "+arr[right]+" ");
            }
        }
//        System.out.print(sum);
    }
    public static void main(String[] args)
    {
//        int[] arr={2, 7, 11, 15};
        int[] arr={3, 2, 4};
        findthetarget(arr, 6);
    }
}
