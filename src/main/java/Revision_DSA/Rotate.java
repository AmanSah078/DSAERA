package Revision_DSA;

public class Rotate {
static void findrotate(int[] arr, int k)
{
    int n=arr.length;
    k=k%n; //When the value of k is graete that n
    //For the 2nd Part
    //Create one Temporary Memory To store the value
    int temp[]= new int[n];
    int j=0;
    for(int i=n-k; i<n; i++)
    {
        temp[j]=arr[i];
        j++;
    }

    //For the 1st Part
    for(int i=0; i<n-k; i++)
    {
        temp[j]=arr[i];
        j++;
    }
    //Copy back to Main Memory
    for(int i=0; i<n; i++)
    {
        arr[i]=temp[i];
    }
}
public static void main(String[] args)
{
    int[] arr={10,20,30,40,50};
    findrotate(arr,2);
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
}
