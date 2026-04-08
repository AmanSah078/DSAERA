package StriverArrayQuest;

public class Left_Rotate {
    static void leftrotate(int[] arr)
    {
        int first=arr[0];
        for(int i=0; i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        //Special loop to print the all output
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args)
    {
        int[] arr={1, 2, 3, 4, 5};
        leftrotate(arr);
    }
}
