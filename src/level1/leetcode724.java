package level1;

/**
 * @ClassName leetcode724
 * @Description TODO
 * @Author ZengRj
 * @Date 2022/7/18 00:30
 * @Version 1.0
 */
public class leetcode724 {
    public static int pivotIndex(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        if (nums.length ==1){
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum - nums[0] == 0) {
            return 0;
        } else {
            int target = 0;
            for (int i = 1; i < nums.length; i++) {
                target += nums[i - 1];
                if((sum - nums[i])%2!=0){
                    continue;
                } else if (target == (sum - nums[i]) / 2) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-1,-1,-1,-1,-1};
        System.out.println(pivotIndex(nums));
    }
}
