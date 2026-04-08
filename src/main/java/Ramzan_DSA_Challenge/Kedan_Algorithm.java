package Ramzan_DSA_Challenge;

public class Kedan_Algorithm {
    static void findkedans(int[] arr)
    {
        int currsum=0;
        int ovsum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(currsum>=0)
            {
                currsum=currsum+arr[i];
            }
            else {
                currsum=arr[i];
            }
            if(currsum>ovsum)
            {
                ovsum=currsum;
            }
        }
        System.out.print(ovsum);
    }
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        findkedans(arr);
    }
}
