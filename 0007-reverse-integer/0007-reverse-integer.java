class Solution {
    public int reverse(int n) {
        int temp=n;
        int sign=1;
        if(temp<0){
            temp=-temp;
            sign=-1;
        }
    int rev = 0;
    while (temp > 0) {
      int digit = temp % 10;
    if(rev>(Integer.MAX_VALUE-digit)/10){
        return 0;
      }
      rev = rev * 10 + digit;
      temp /= 10;
    }
    return sign*rev;
  }
}