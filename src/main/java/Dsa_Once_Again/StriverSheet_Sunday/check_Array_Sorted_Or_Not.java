package Dsa_Once_Again.StriverSheet_Sunday;

public class check_Array_Sorted_Or_Not {
static boolean check_Array_Sorted_Not(int[] arr){
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i+1]<arr[i])
        {
            return false;
        }
    }
    return true;
}
public static void main(String[] args) {
    int[] arr={1, 2, 3,47, 5};
    System.out.println(check_Array_Sorted_Not(arr));
}
}
