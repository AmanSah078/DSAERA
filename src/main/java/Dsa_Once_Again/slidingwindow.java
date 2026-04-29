package Dsa_Once_Again.Array_Pattern3_Sliding_Window;

import java.util.Scanner;

public class slidingwindow {
    static void findtheslidingwindow(int[] users, int days)

    {
        //1st loop from 0 to days tk
        int windowsize=0;
        for(int i=0; i<days;i++)
        {
            windowsize=windowsize+users[i];
        }
        System.out.println("Total no of users visiting " +windowsize);
        //To manage the sliding window

        for(int i=1; i<=users.length-days; i++)
        {
            windowsize= windowsize-users[i-1]+users[i+days-1];
            //Ek Ek step ka chahiye na to loop ke andar hi print kr
            System.out.println("Total no of users visiting " +windowsize);
        }
//        System.out.print(windowsize);
    }

    public static void main(String[] args) {
        int[]user={100,48,82,57,34,112,65};
        findtheslidingwindow(user,3);
    }

}
