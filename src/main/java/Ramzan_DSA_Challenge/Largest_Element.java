package Ramzan_DSA_Challenge;

public class Largest_Element {

    static void largest(int[] arr)
    {
        int largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("largest Element is " +largest);
        System.out.print("Thank You");
    }
    public static  void main(String[] args)
    {
        int[] arr={3, 7, 2, 9, 5};
        largest(arr);
    }
}
