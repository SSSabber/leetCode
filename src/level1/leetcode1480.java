package level1;

import java.util.Arrays;

/**
 * @ClassName test1480
 * @Description TODO
 * @Author ZengRj
 * @Date 2022/7/18 00:14
 * @Version 1.0
 */
public class leetcode1480 {
    public static int[] runningSum(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] + nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
