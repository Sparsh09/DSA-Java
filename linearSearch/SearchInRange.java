package linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] ar = {24, 45 , 1 ,54, 65, 244,643,234,64};
        int target = 45;
        int start = 3;
        int end = 5;
        System.out.println(search(ar , target, start , end));
    }

    static boolean search(int[] ar, int target , int start, int end){
        if(ar.length == 0)
            return false;
        for (int i = start ; i < end ; i++){
            if(ar[i] == target)
                return true;
        }
        return false;
    }
}
