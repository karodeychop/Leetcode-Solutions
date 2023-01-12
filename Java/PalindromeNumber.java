class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        boolean palindrome = true;

        for(int i = 0; i < (s.length() / 2) && palindrome; i++) {
            char a = s.charAt(i);
            char b = s.charAt((s.length() - (i + 1)));

            if(!(a == b)) {
                palindrome = false;
            }
        }

        return palindrome;
    }
}