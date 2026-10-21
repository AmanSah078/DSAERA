package Dsa_Once_Again.Array_Pattern_Two_Pointer.Revision;

public class Sort_zero_one {


    static void tofindsort(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                //isi ke andar swap kr
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            else if (arr[left] == 0) {
                left++;
            }
           else if (arr[right] == 1) {
                right--;
            }
        }
    }
//    public static void main(String[] args)
//    {
//        int[] arr={0, 1, 1, 0, 1, 0, 0, 1};
//
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
//        tofindsort(arr);
//    }
public static void main(String[] args)
{
    int[] arr={0, 1, 1, 0, 1, 0, 0, 1};

    tofindsort(arr);   // pehle sort karo

    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
}
