package Dsa_Once_Again.Target_50_Questions;

public class Min_Element {

    static int findmin(int[] arr)
    {
        int min = arr[0];
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]<min)
          {
              min=arr[i];
          }
        }
        return min;
    }
    public static void main(String[] args) {
       // int[] arr={10,20,30,40,50};
      //  int[] arr={-10,-5,-2,-1,-7,-3};
        int[] arr = {5,5,5,5,5};
        int result = findmin(arr);
        System.out.println(result);
    }
}
