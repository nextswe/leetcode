package weekly.array;

public class LC121 {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int maxProfit = 0;
        int runningProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(lowest>prices[i]){
                lowest = prices[i];
            }
            runningProfit = prices[i]-lowest;
            if(maxProfit < runningProfit){
                maxProfit = runningProfit;
            }
        }
        return maxProfit;
    }
}
