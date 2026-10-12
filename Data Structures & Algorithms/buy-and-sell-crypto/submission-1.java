class Solution {
    public int maxProfit(int[] prices) {
        int bestProfit = 0;
        int min = prices[0];
        int max = prices[0];
        for (int num : prices) {
            if (num < min) {
                if (max - min > bestProfit) {
                    bestProfit = max - min;
                }
                min = num;
                max = num;
            }
            if (num > min && num > max) {
                max = num;
            }
        }
        if (max - min > bestProfit) {
            bestProfit = max - min;
        }
        return bestProfit;
    }
}
