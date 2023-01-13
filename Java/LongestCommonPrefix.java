class Solution {
    public String longestCommonPrefix(String[] strs) {
        int subCut = 0;
        boolean allMatch = false;
        char toMatch;
        String prefix = "";

        for(int i = 0; i < strs[0].length() && subCut == i; i++) {
            toMatch = strs[0].charAt(i);
            allMatch = true;
            for(int j = 1; j < strs.length; j++) {
                if((strs[j].length() - 1) < i || !(strs[j].charAt(i) == toMatch)) {
                    allMatch = false;
                }
            }
            if(allMatch) {
                subCut++;
            }

        }

        if(subCut > 0) {
            prefix = strs[0].substring(0, (subCut));
        }

        return prefix;
    }
}