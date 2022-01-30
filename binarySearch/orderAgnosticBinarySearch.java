package binarySearch;

// in this the given array is sorted but don't know in ascending or descending order

public class orderAgnosticBinarySearch {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int target = 5 ;
        //check the array is in ascending or descending
        int ans ;
        if(arr[0] > arr[arr.length - 1]){
            ans = desc(arr , target);
        }else{
           ans =  asc(arr, target);
        }
        System.out.println(ans);
    }

    static int desc(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end-start) / 2;

            if(arr[mid] > target){
                start = mid +1; 
            }else if(arr[mid] < target){
                end = mid -1;
            }else if(arr[mid] == target){
                return mid;
            }
        }
        return -1;
    }

    static int asc(int[] arr, int target){
        int start = 0;
        int end = arr.length -1 ;
        while(start <= end){
            int mid = start + (end-start) / 2;

            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid -1;
            }else if(arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
    
}
