package Dsa_Once_Again.StriverSheet_Sunday_2;

public class unique_Element {
    static void finduniqueelement(int[] arr)
    {
        int n=arr.length;
        int [] freq= new int[10];
        for(int i=0; i<n; i++)
        {
            freq[arr[i]]++;
        }
        for(int i=0; i<freq.length; i++)
        {
            if(freq[i]==1)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,2};
        finduniqueelement(arr);

    }
}
