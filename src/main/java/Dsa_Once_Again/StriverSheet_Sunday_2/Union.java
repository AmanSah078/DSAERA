package Dsa_Once_Again.StriverSheet_Sunday_2;

public class Union {

    static void unioni(int[] arr1, int[] arr2)
    {
        int[] combine = new int[arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++)
        {
            combine[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++)
        {
            combine[arr1.length + i] = arr2[i];
        }

        for(int i = 0; i < combine.length; i++)
        {
            System.out.print(combine[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,4};

        unioni(arr1, arr2);
    }
}