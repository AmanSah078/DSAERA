package Dsa_Once_Again.DSA_SHEET_PATTERN_3_WITH_Basic;



public class First_Neg_In_Every_Neg {

    static void findthefirstneg(int[] arr, int k)
    {
        // outer loop = window start
        for(int i = 0; i <= arr.length - k; i++)
        {
            boolean found = false;

            // inner loop = window ke andar check
            for(int j = i; j < i + k; j++)
            {
                if(arr[j] < 0)
                {
                    System.out.print(arr[j] + " ");
                    found = true;
                    break;
                }
            }

            // agar koi negative nahi mila
            if(!found)
            {
                System.out.print("0 ");
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        findthefirstneg(arr, 3);
    }
}

