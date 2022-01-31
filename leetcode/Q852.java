package leetcode;

public class Q852 {
    public static void main(String[] args){
        int[] arr = {0,1,0};
        System.out.println(arr[peakIndexInMountainArray(arr)]);
 
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0 ;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start ) / 2;
            if(arr[mid] > arr[mid+1]){
                // you are in the decreasing part 
                //but check the left part
                // this may be the ans that is why end != mid - 1
                end = mid;
            }else{
                // you are in the increasing part 
                // but check the right part
                // as this element is smaller than the next element so that is why start = mid + 1
                start = mid + 1;
            }
        }
        // at this point the start == end therefore this is the largest element because of the checks
        return start;
    }
}
