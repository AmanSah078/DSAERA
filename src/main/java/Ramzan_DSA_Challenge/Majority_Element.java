package Ramzan_DSA_Challenge;

public class Majority_Element {

    static void findmaj(int[] arr)
    {
        int majority=arr[0];
        int voting=1;
        for(int i=0;i<arr.length;i++)
        {
        if(voting==0)
        {
          voting++;
        }
        else if(arr[i]==majority)
        {
            majority=arr[i];
            voting++;
        }
        else {
            voting--;
        }
        }
        System.out.print(majority);
    }
    public static void main(String[] args)
    {
        int[] arr={2,2,1,3,1,2,2};
        findmaj(arr);
    }
}
