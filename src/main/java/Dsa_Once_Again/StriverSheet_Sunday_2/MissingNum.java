package Dsa_Once_Again.StriverSheet_Sunday_2;

public class MissingNum {
    static void missingnumber(int[] arr)
    {
        int index=-1;
        for(int i=0; i<arr.length; i++)
        {
           if(arr[i]+1!=arr[i+1])
           {
               index=arr[i]+1;
               break;
           }
        }
        System.out.println(index);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        missingnumber(arr);
    }
}
