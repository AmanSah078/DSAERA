package Dsa_Once_Again.StriverSheet_Sunday_2;

public class Left_Rotate {

    static void leftRotate(int[] arr) {
        int last = arr[0];
        for (int i = 0; i < arr.length-1; i++)
        {
            arr[i] = arr[i + 1];
        }
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        arr[arr.length - 1] = last;
        System.out.println(last);
    }
    public static void main(String[] args) {
        //int[] arr={1,2,3,4,5};
        int[] arr={10};
        leftRotate(arr);
    }
}
