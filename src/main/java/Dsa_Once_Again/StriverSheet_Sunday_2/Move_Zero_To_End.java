package Dsa_Once_Again.StriverSheet_Sunday_2;

public class Move_Zero_To_End {

    static void moveZeros(int[] arr) {
        int n=arr.length;
    int store=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[store++]=arr[i];
            }
        }
        while(store<n){
            arr[store++]=0;
        }
    }
    public static void main(String[] args) {
       // int[] arr={1,0,2,0,4,0};
        int[] arr={0,0,0};
        moveZeros(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
