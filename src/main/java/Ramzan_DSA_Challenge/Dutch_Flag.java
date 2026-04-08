package Ramzan_DSA_Challenge;

public class Dutch_Flag {
        static void finddutch(int[] arr)
        {
            int left=0;
            int mid=0;
            int right=arr.length-1;

            while(mid<=right)
            {
                if(arr[left]==0)
                {
                    int temp=arr[mid];
                    arr[left]=arr[mid];
                    arr[mid]=temp;
                    left++;
                    mid++;
                }
                else if(arr[mid]==1) {
                    //only positon willl be increase
                    mid++;
                }
                else {
                    //Need of swap
                    int temp=arr[mid];
                    arr[right]=arr[mid];
                    arr[mid]=temp;
                    right--;

                }
            }
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        public static void main(String args[])
        {
            int[] arr={0,0,1,1,2,2};
            finddutch(arr);
        }
    }


