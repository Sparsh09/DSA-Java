package leetcode;
import java.util.HashSet;
public class Q217 {
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums)
        {
            if(set.contains(num))
                return true;
            else
                set.add(num);
        }
        return false;
    }
}
