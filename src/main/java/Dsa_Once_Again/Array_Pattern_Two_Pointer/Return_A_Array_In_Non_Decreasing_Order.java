package Dsa_Once_Again.Array_Pattern_Two_Pointer;

import java.util.Arrays;

public class Return_A_Array_In_Non_Decreasing_Order {

    static void tofindthenondecreasing(int[]arr)
    {
        int n=arr.length;
        int left=0;
        int right=n-1;
        //u have to store in the new array na dude
        int[] ans=new int[n];
//int k=0; //By using this u get the ouput in the form in the decreaing order
        int k=n-1; //By using this u get the ouput in the form in the Non_Decreaing_Order Gotit na dude
        //while(left<right) //We get the output in the form in the decreasing order
            while(left<=right)//But i want the value in the formo in The Non-Decresing Order na
        {
            //To use the Abs value to remove the sign of the array
//            if(Math.abs(arr[left]>Math.abs(arr[right])))
            if(Math.abs(arr[left]) > Math.abs(arr[right]))
            {
                ans[k]=arr[left]*arr[left];
                //k++;
                k--;
                left++;
            }
            else {
                ans[k]=arr[right]*arr[right];
                //k++;
                k--;
                right--;
            }

        }
        System.out.println(Arrays.toString(ans));
        //reverse
    }
    public static void main(String[] args)
    {
        int[] arr={-10,-3,-2,1,4,5};
        tofindthenondecreasing(arr);
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
    }
}









