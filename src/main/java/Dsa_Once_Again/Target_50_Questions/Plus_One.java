package Dsa_Once_Again.Target_50_Questions;

public class Plus_One {
    static void toaddplusone(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i<arr.length-1){
                System.out.println(arr[i]);
            }
            else{
                System.out.println(arr[i]+1);
            }
        }
    }
    public static void main(String[] args)
    {
        //int[] arr={1,2,3};
        int[] arr={9,9,9};
        toaddplusone(arr);
    }
}
