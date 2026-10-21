package Dsa_Once_Again.Target_50_Questions;

public class Richest_Customer_Wealth {

    static void tofindtherichestcustomerwealth(int[][] arr)
    {

        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=0; j<arr[i].length;j++) {
                sum = sum + arr[i][j];
            }
                if(sum>max)
                {
                    max=sum;
                }

            }
        System.out.println("Maximum Wealth is "+max);

        }


    public static  void main(String[] args)
    {
        int[][] arr= {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        tofindtherichestcustomerwealth(arr);
    }
}
