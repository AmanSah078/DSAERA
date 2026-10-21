package Dsa_Once_Again.DSA_SHEET_PATTERN_3_WITH_Basic;

public class First_Neg_In_Every_WIndow {
     static void findthefirstneg(int[] arr, int k)
     {
         //phle 1st loop ko khatam kron
         for(int i=0; i<k; i++)
         {
             if(arr[i]<0)
             {
                 System.out.print(arr[i]+" ");
                 break;
             }
         }

         //now this loop is used to manage the another sliding
         for(int i=1; i<arr.length-k; i++)
         {
             if(arr[i]<0)
             {
                 System.out.print(arr[i]+" ");
                 break;
             }
         }
     }
     public static void main(String[] args)
     {
         int[] arr={12, -1, -7, 8, -15, 30, 16, 28};
         findthefirstneg(arr,3);
     }
}
