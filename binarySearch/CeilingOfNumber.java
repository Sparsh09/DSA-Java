package binarySearch;

public class CeilingOfNumber {
    public static void main(String[] args){
        
        int[] arr = {2,4,6,8,14,16,19};
        int target = 22;
        System.out.println(arr[ceiling(arr, target)]);

    }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] == target){
                return mid;
            }
        }
        return start;
    }   
}
