class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        /* create a reversed number, and if reverse != original, it is not palindrome */
        int temp = x;
        int reversed = 0;
        while (true){
            reversed += (temp % 10);
            temp /= 10;
            if (temp == 0){
                if (reversed == x){
                    return true;
                }
                else{
                    return false;
                }
            }
            reversed *= 10;
        }
    }
}