package Dsa_Once_Again.DSA_SHEET_PATTERN_2_With_Basic;

public class Sum_of_The_Array
{
    static int findtheprefix(int[] arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            arr[i]=arr[i]+arr[i-1];
        }
        return  arr[n-1];
    }
    public  static  void main(String[] args)
    {
        int[] arr={3,1,2,10,1};
        int result=findtheprefix(arr);
        System.out.println(result);
    }

}
