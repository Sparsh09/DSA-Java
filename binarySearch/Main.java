package binarySearch;

public class Main {
    
    public static void main(String[] args){
        int[] ar = {-18,-12,-4,5,33,34,45,456,6776,8888};
        int target = 5;
        int ans = binarySearch(ar, target);
        System.out.println(ans);
    }

    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            // find the middle element
            int mid = start + (end-start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else if(target == arr[mid]){
                return mid;
            }
        }
        return -1;

    }
    
}
