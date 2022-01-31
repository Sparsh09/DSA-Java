package leetcode;

import binarySearch.orderAgnosticBinarySearch;

public class Q1095 {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ele = findPeakElementInMountain(arr);
        int ans = orderAgnosticBinarySearch(arr, target, 0, ele);
        if(ans != -1){
            System.out.println(ans);
        }else {
            ans = orderAgnosticBinarySearch(arr, target, ele, arr.length-1);
            System.out.println(ans);
        }
        

    }

    static int orderAgnosticBinarySearch(int[] arr, int target , int start , int end){
        // int start = 0;
        // int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[0] < arr[arr.length - 1]){
                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }else {
                    return mid;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else if(target > arr[mid]){
                    end = mid - 1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }
    static int findPeakElementInMountain(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start) /2 ;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    
}
