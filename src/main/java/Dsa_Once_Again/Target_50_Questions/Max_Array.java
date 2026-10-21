package Dsa_Once_Again.Target_50_Questions;

public class Max_Array {
    static int findthemax(int[] arr)
    {
        if(arr.length==0)
        {
            return -1;
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
       return max;

    }
    public static void main(String[] args)
    {

    //    int[] arr={-10,-5,-2,-1,-7,-3};
      int[] arr= {1000,2500,9999,4567};
      int result=findthemax(arr);
      System.out.println(result);
    }
}
