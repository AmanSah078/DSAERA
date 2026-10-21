package Dsa_Once_Again.Binary_Search_Problems;

class CeilingElement {

    static int findCeilingElement(int[] arr, int target) {
//jb maan lo ki target 20 ho jaye then?
        if(target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
//			Jab target mil jaye,
//search stop kar do.
            else {
                return arr[mid];
            }
        }

        return arr[start];
    }

    public static void main(String[] args) {

        int[] arr = {2,3,5,14,16,18};
        int target = 15;

        int result = findCeilingElement(arr, 15);

        System.out.println(result);
    }
}