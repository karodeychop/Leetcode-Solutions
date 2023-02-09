class Solution {
    public boolean isSubsequence(String s, String t) {
        int sCounter = 0;
        boolean isSub = false;
        if(s.length() == 0 || (s.length() == 0 && t.length() == 0)) {
            isSub = true;
        } else {
            for(int i = 0; i < t.length() && !isSub; i++) {
                if(s.charAt(sCounter) == t.charAt(i)) {
                    sCounter++;
                    if(sCounter == s.length()) {
                        isSub = true;
                    }
                }
            }
        }
        
        return isSub;
    }
}