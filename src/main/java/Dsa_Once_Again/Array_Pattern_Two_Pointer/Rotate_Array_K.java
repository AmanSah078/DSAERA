package Dsa_Once_Again.Array_Pattern_Day_1;

public class Rotate_Array_K {
static void rotatearray(int[] arr, int k)
{

    int n=arr.length;
    k=k%n;
    int[] temp = new int[n];  // temporary array
    int j = 0;

    //For the 2nd part
    for(int i=n-k; i<n; i++)
    {
        temp[j]=arr[i];
        j++;
    }

    //For the 1st part
    for(int i=0; i<n-k; i++){
        temp[j]=arr[i];
        j++;
    }
    // copy back to original array
    for (int i = 0; i < n; i++) {
        arr[i] = temp[i];
    }
}
public static void main(String[] args)
{
    int[] arr={1,2,3,4,5,6,7};
    int k=5;
    rotatearray(arr,k);
for(int i=0;i<arr.length;i++)
{
    System.out.println(arr[i]);
}
}

}
