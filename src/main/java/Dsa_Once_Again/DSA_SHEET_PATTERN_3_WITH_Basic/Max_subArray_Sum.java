package Dsa_Once_Again.DSA_SHEET_PATTERN_3_WITH_Basic;

public class Max_subArray_Sum {
    static void findthemaxsubArray(int[] arr,int k) {
        int windowsize = 0;
        int max=0;
        //1st loop for to find the max from 0 to 2 range
        for (int i = 0; i < k; i++)
        {
            windowsize += arr[i];
            //or isi ko max le lenge
            max=windowsize;
    }
        //now lets remove fromt the prev one and add the next one
        for(int i=1;i<arr.length-k; i++)
        {
            windowsize=windowsize-arr[i-1]+arr[i+k-1];
            if(windowsize>max)
            {
                max=windowsize;
            }

        }

        System.out.println("Max Sub Array Sum is " + max);
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,1,3,2};
        findthemaxsubArray(arr,3);
    }
}
