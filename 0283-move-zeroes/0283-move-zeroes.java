class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> nonzeroarr = new ArrayList<>();
        List<Integer> zeroarr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroarr.add(nums[i]);
            } else {
                nonzeroarr.add(nums[i]);
            }
        }

        int index = 0;
        for (int n : nonzeroarr) {
            nums[index++] = n;
        }
        for (int z : zeroarr) {
            nums[index++] = z;
        }
    }
}
