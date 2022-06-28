class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (!map.containsKey(sc) && !map.containsValue(tc)) {
                map.put(sc, tc);
            }

            if (!map.containsKey(sc) || map.get(sc) != tc) {
                return false;
            }
        }

        return true;
    }
}