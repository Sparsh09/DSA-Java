package leetcode;

public class Q1295 {
    public static void main(String[] args) {
        int[] ar = {
                12, 345, 2, 6, 7896
        };

        int ans = countDigit(ar);
        int ans1 = count(ar);
        System.out.println(ans);
        System.out.println(ans1);
    }

    static int countDigit(int[] ar) {
        int ans = 0;
        for (int n : ar) {
            int count = 0;
            while (n != 0) {
                n = n / 10;
                count++;
            }
            if (count % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
    static int count(int[] ar){
        int ans = 0;
        for(int n : ar){
            if(Integer.toString(n).length() % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
}
