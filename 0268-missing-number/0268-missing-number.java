class Solution {
    public int missingNumber(int[] a) {
        int n = a.length;                  
        int sum = (n * (n + 1)) / 2;       
        for (int i = 0; i < n; i++) {
            sum -= a[i];                   
        }
        return sum;                     
    }
}