class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to track the position for the next valid element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Copy the valid element to the k-th position
                k++;
            }
        }
        return k; // Return the count of remaining elements
    }
}
