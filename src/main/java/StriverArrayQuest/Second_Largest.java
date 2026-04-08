//Find the SecondLargest

package StriverArrayQuest;

public class Second_Largest {
    static void tofindsecondlargest(int[] arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int secondlarest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(max>arr[i] && arr[i]>secondlarest)
            {
                secondlarest=arr[i];
            }
        }
        System.out.print(secondlarest+" ");
    }
    public static void main(String[] args)
    {
        int[] arr={10, 45, 2, 89, 33};
        tofindsecondlargest(arr);
    }
}
