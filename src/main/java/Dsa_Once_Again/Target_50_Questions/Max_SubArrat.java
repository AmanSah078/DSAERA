package Dsa_Once_Again.Target_50_Questions;

public class Max_SubArrat {
    static void findthemaxsubarray(int[] arr,int k)
    {
        int sum=0;
        int max=0;
//1.st loop is mandatory
        for(int i=0; i<k; i++)
        {
            sum=sum+arr[i];
        }
 //Now khela hobe ab
 for(int i=1; i<arr.length-k; i++)
 {
     sum=sum-arr[i-1]+arr[i+k-1];
     max=Math.max(max,sum);
 }
 System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,1,3,2};
        findthemaxsubarray(arr,3);

    }
}
