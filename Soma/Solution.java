package Soma;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++ ) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public int[] twoSumRec(int[] nums, int target, int a, int b) {
        if(a == nums.length) {
            int[] res = {-1,-1};
            return res;
        }
        if(nums[a] + nums[b] == target) {
            int[] res = {a,b};
            return res;
        }
        if(b < nums.length-1){
            return twoSumRec(nums, target, a, ++b);
        }
        return twoSumRec(nums, target, ++a, ++a);
    }
}
