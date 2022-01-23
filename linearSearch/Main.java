package linearSearch;

public class Main {
    public static void main(String[] args) {

        int[] nums = {24, 45 , 1 ,54, 65, 244,643,234,64};
        int target = 1    ;
        int ans = linearsearch(nums , target);
        System.out.println(ans);
    }

    //search in the array return index if item found
    // else return -1
    static int linearsearch(int[] ar, int target ){
        if(ar.length == 0){
            return -1;
        }
        // run a for loop
        for(int index = 0 ; index < ar.length; index++){
            // checks for element at every index if it is target
            int element  = ar[index];
            if(element == target){
                return index;
            }
        }
        // this line will run if the target is not founded
        return -1;

    }
    // checks whether the array has element or not if then returns the element
    static int linearsearch2(int[] ar, int target ){
        if(ar.length == 0){
            return Integer.MAX_VALUE;
        }
        // run a for loop
        for (int i : ar) {
            if (i == target)
                return target;
        }
        // this line will run if the target is not founded
        return Integer.MAX_VALUE;

    }
    static boolean linearsearch3(int[] ar, int target ){
        if(ar.length == 0){
            return false;
        }
        // run a for loop
        for (int i : ar) {
            if (i == target)
                return true;
        }
        // this line will run if the target is not founded
        return false;

    }
}
