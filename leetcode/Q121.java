package leetcode;

public class Q121 {

    public static void main(String[] args){

        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentProfit = 0;
        if(prices.length == 0 || prices.length == 1) return 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] > maxProfit){
                
                for(int j=i+1;j<prices.length;j++){
                    currentProfit = prices[j] - prices[i];
                    if(maxProfit < currentProfit){
                        maxProfit = currentProfit;
                    }
                }
            }
        }
        return maxProfit != 0 ? maxProfit : 0;
    }
}
