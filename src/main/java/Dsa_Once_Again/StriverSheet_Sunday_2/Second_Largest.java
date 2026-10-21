package Dsa_Once_Again.StriverSheet_Sunday_2;

public class Second_Largest {
static void findthesecondlarget(int[] arr)
{
    int max=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }
int secondlarest=-1;
    for(int i=0;i<arr.length;i++)
    {
        if(max>arr[i] &&  arr[i]>secondlarest)
        {
            secondlarest=arr[i];
        }

    }
    System.out.println(secondlarest);
}
public static void main(String[] args)
{
//    int[] arr={1,2,4,7,7,5};
    int[] arr={10,10,10};
    findthesecondlarget(arr);
}

}
