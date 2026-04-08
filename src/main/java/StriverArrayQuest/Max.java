package StriverArrayQuest;

public class Max {
    static void findmax(int[] arr)
    {
        int max=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args)
    {
        int[] arr={5,10,6,7};
        findmax(arr);
    }
}
