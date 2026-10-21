package Dsa_Once_Again.DSA_SHEET_Pattern1_With_Basic;

public class Pair_sum_target_sum {
    static void pairtoequaltarget(int[] arr, int target)
    {
        int left=0;
        int right=arr.length-1;
        int sum=0;

        while(left<right)
        {
            sum=arr[left]+arr[right];
            if(sum==target)
            {
                System.out.println(left+" "+right);
                break;
            }
            //or sb kon krega
            else if(sum>target)
            {
                right--;
            }
          else {
              left++;
            }

        }
    }
    public static void main(String[] args)
    {
        int[] arr={3, 1, 4, 6, 5};
        pairtoequaltarget(arr,7);
    }
}
