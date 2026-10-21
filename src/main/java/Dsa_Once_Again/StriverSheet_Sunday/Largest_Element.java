package Dsa_Once_Again.StriverSheet_Sunday;

public class Largest_Element {

    static void findthemax(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)

        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        int[] arr={10, 5, 20, 8};
        findthemax(arr);
    }

}
