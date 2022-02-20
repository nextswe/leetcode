package weekly.array;

import java.util.HashMap;
import java.util.Map;

public class LC1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
    public static void main(String[] args){
        int[] result = twoSum(new int[]{2,7,11,15}, 9);
    }
}
