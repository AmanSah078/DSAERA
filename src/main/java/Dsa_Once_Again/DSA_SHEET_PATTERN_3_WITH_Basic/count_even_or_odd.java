package Dsa_Once_Again.DSA_SHEET_PATTERN_3_WITH_Basic;

public class count_even_or_odd {
    static void coutnevenandodd(int[] arr)

    {
        int count=0;
        int countt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
            count++;
            }
            else {
                countt++;
            }
        }
        System.out.println("Even no will be " + count);
        System.out.println("Odd no will be " + countt);
         }
         public static void main(String[] args)
         {
//             int[] arr={1,2,3,4,5};
//             int[] arr={2,4,6,8};
             int[] arr={10,15,20,25,30};
             coutnevenandodd(arr);
         }
   }
