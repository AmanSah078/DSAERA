package Dsa_Once_Again.Practice_Questions_Pair_Wise;

public class Max_Array {

    static void findthemax(int[] arr) {
        int max = arr[0];
for(int i=0; i<arr.length; i++){
    if(arr[i]>max)
    {
        max=arr[i];
    }
}
System.out.println(max);
    }
    public static void main(String[] args)
    {
        int[] arr={4,5,7,8,1};
        findthemax(arr);
    }
}
