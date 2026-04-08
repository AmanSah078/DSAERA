package StriverArrayQuest;

public class Array_Is_Sorted {
    static boolean tocheckarray(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public  static void main(String[] args)
    {
        //int[] arr={1, 3, 5, 7, 9};
        int[] arr={2,5,8,47,1};
            boolean result=tocheckarray(arr);
            System.out.println(result);
    }
}
