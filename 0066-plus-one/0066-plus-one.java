class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            // Set current digit to 0 if it is 9
            digits[i] = 0;
        }
        
        // If all digits were 9, we need an additional digit
        int[] result = new int[n + 1];
        result[0] = 1; // Set the most significant digit to 1
        return result;
    }
}
