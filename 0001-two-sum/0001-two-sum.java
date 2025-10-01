class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = 1;

        while (left < nums.length) {
            if (right >= nums.length) {
                left++;
                right = left + 1;
                continue;
            }

            if (nums[left] + nums[right] == target) {
                return new int[] { left, right };
            } else {
                right++;
            }
        }

        return new int[] {};
    }
}
