package weekly.array;

public class LC53 {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int runningSum = 0;
        for(int i=0;i<nums.length;i++){
            runningSum += nums[i];
            ans = Math.max(ans, runningSum);
            if(runningSum < 0){
                runningSum = 0;
            }
        }
        return ans;
    }
}
