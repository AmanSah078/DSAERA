//Dude Try to Solve this Proble with the Best Way
package Dsa_Once_Again.Frequency_Array_Pattern_5;

public class Find_The_Missing_Num_By_Using_Sum {
    static void findthemissing(int[] arr)
    {

        int n=arr.length;
        int n1=n+1; //bcz excepted range should be
        int sum=0;
        for(int i=0; i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
//        int missing=n1(n1+1)/2-sum;
        int missing = n1 * (n1 + 1) / 2 - sum;
        System.out.print(missing);
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        findthemissing(arr);
    }
}
