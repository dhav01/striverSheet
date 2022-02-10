class Solution {
    public int maxProfit(int[] prices) {

        //brute force: using DP

        //another approach: using nested for loops

        //optimal approach: traverse the array from left to right and store the min value encountered so far
        //calculate the max profit by finding the difference between curr val and min val

        int minTillNow = prices[0];
        int maxProfit =0;
        int size = prices.length;


        for(int i=1;i<size;i++){
            maxProfit = Math.max(maxProfit,prices[i]-minTillNow);

            minTillNow = Math.min(minTillNow,prices[i]);
        }

        return maxProfit;

    }
}
