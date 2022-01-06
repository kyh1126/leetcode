class Solution {
    public int[] twoSum(int[] nums, int target) {
        int idx = 0;
        int len = nums.length;

        while (idx < len) {
            int toFind = target - nums[idx];

            for (int i = idx+1; i < len; i++) {
                if (nums[i] == toFind) {
                    return new int[]{idx, i};
                }
            }
            idx++;
        }
        return null;
    }
}