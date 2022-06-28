class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("")) return true;

        for (int i = 0, j = 0; i < t.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
                if (j == s.length()) {
                    return true;
                }
            }
        }

        return false;
    }
}