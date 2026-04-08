package Ramzan_DSA_Challenge.Two_Pointer_Prob;

public class Two_Sum {
    static void findtwosum(int[]arr, int target)
    {
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum==target)
            {
                System.out.println(left+" "+right);
                break;
            }
            else if(sum>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr={2,7,11,15};
        findtwosum(arr,9);
    }

}
