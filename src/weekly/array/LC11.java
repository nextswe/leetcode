package weekly.array;

public class LC11 {
    public int maxArea(int[] height) {
        int maxVolume = 0;
        int n = height.length;
        int left = 0;
        int right = n-1;
        while(left<n && right>=0){
            int barA = height[left];
            int barB = height[right];
            int distance = right-left;
            maxVolume = Math.max(maxVolume, distance*(Math.min(barA,barB)));
            if(barA<barB){
                left++;
            }else{
                right--;
            }
        }
        return maxVolume;
    }
}
