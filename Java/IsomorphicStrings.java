class Solution {
    public boolean isIsomorphic(String s, String t) {
        String newString = "";
        HashMap<Character, Character> table = new HashMap<Character, Character>();

        for(int i = 0; i < s.length(); i++) {
            if(!(table.containsKey(s.charAt(i))) && !(table.containsValue(t.charAt(i)))) {
                table.put(s.charAt(i), t.charAt(i));
            }
        }

        for(int i = 0; i < s.length(); i++){
            newString += table.get(s.charAt(i));
        }

        return (newString.equals(t));
    }
}