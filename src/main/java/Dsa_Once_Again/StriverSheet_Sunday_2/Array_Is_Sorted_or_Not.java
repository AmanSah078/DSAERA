package Dsa_Once_Again.StriverSheet_Sunday_2;

public class Array_Is_Sorted_or_Not {
    static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
       // int last=arr[arr.length-1];
        //System.out.println("last:"+last);
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        boolean b=isSorted(arr);
       System.out.println(b);
    }
}
