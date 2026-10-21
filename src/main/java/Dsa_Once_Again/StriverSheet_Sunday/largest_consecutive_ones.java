package Dsa_Once_Again.StriverSheet_Sunday;

public class largest_consecutive_ones {
    static void findthelargest(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
            else {
                count=0;
            }
        }
        int max=0;
        if(count>max)
        {
            max=count;
        }
        System.out.print(max);
    }
    public static void main(String[] args)
    {
        int[] arr={1,1,0,1,1,1,1};
        findthelargest(arr);
    }
}
