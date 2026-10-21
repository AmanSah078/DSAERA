package Dsa_Once_Again.StriverSheet_Sunday;

public class Missing_Num {
    static void findthemissingnum(int[] arr)
    {
        int index=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]!=arr[i]+1)
            {
                index=arr[i]+1;
                System.out.println(index);
                break;
            }
        }
         }
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        findthemissingnum(arr);
    }
}
