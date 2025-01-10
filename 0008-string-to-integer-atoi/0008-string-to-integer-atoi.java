class Solution {
    public int myAtoi(String s) {
       
        s = s.trim();
        if (s.isEmpty()) {
            return 0; 
        }
        
        int sign = 1; 
        int index = 0; 
        int n = s.length();
        

        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++; 
        }
        
        int result = 0;
        
        while (index < n) {
            char currentChar = s.charAt(index);
            if (!Character.isDigit(currentChar)) {
                break;
            }
            
            int digit = currentChar - '0';
            
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            index++;
        }
        
        return result * sign;
    }
}
