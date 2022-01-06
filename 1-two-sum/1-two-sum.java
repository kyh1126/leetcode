class Solution {
    public int[] twoSum(int[] nums, int target) {
        int idx = 0;
        int len = nums.length;

        while (idx < len) {
            int toFind = target - nums[idx];

            for (int i = idx + 1; i < len; i++) {
                if (nums[i] == toFind) {
                    return new int[]{idx, i};
                }
            }
            idx++;
        }
        return new int[0];
    }

//    public static void main(String[] args) {
//        int[] nums = {3, 2, 4};
//        int target = 6;
//        Solution s = new Solution();
//        int[] result = s.twoSum(nums, target);
//        System.out.println(result[0] + " " + result[1]);
//    }
}
