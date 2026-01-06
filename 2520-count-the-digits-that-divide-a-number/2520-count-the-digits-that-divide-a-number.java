class Solution {
    public int countDigits(int num) {
          int c=0,t=num;
          while(t>0)
          {
            if(num%(t%10)==0)
            c++;
            t/=10;
          }
        return c;
    }
}