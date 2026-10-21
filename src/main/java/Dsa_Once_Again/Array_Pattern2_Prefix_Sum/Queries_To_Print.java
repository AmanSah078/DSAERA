package Dsa_Once_Again.Array_Pattern2_Prefix_Sum;

public class Queries_To_Print {



       static void findtherange(int[] arr, int l, int r)
            {
                int sum=0;
                while(l<=r)
                {
                    sum=sum+arr[l-1];
                    l++;
                }
                System.out.println(sum);
            }
            public static void main(String[] args)
                {
//                int[] arr={1,2,3,4,5};
                    int[] arr={5,2,8,1,6,3};
//                findtherange(arr,1,5);

                    findtherange(arr,2,5);

           }
    }

