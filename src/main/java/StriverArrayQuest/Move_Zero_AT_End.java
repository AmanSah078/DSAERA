package StriverArrayQuest;

public class Move_Zero_AT_End {
    static void movezerotoend(int[] arr)
    {
int result=0;
for(int i=0; i<arr.length;i++)
{
    if(arr[i]!=0)
    {
        arr[result]=arr[i];
        result++;
    }
}
while(result<arr.length)
{
    arr[result]=0;
    result++;
}
for(int i=0; i<arr.length;i++)
{
    System.out.print(arr[i]);
}
    }
    public static void main(String[] args)
    {
        int[] arr={0, 1, 0, 3, 12};
        movezerotoend(arr);
    }
}
