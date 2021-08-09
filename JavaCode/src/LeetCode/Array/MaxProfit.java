package LeetCode.Array;

/**
 * @author coulson
 * @version 2021-06-29 10:17
 */
public class MaxProfit {
    /*
    * input: prices = [7,1,5,3,6,4]
    * output: 7
    * explain: 1买入5卖出，利润为4； 然后3买入6卖出利润为3。总利润为4+3=7。
    * request: 低进高出，不允许在同一天买卖，无利润则输出0.
    */

    public int maxProfit(int[] prices) {
        //贪心算法(计算前后利润)
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            //原数组中如果后一个减去前一个是正数，说明是上涨的，
            //我们就要累加，否则就不累加
            total += Math.max(prices[i + 1] - prices[i], 0);
        }
        return total;
    }
}
