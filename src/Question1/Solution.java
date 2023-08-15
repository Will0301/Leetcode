package Question1;

public class Solution {
    public static int maxProfit(int[] prices) {
        var lowest = 0;
        var highest = 0;
        var lowestIndex = 0;

        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                lowest = prices[i];
                highest = prices[i];
            }
            if (lowest > prices[i]){
                lowest = prices[i];
                lowestIndex = i;
            }
            if (highest < prices[i] && i < lowestIndex){
                highest = prices[i];
            }
        }
        if (lowestIndex == prices.length - 1) return 0;
        return highest - lowest;
    }
}
