class Solution {
    public int minDeletions(String s) {
        int ans = 0;

        // Store the frequency of each character
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Use a set to store the frequencies we have already seen
        Set<Integer> seen = new HashSet<>();

        for (int i = freq.length - 1; i >= 0; i--) {
            // Keep decrementing the frequency until it is unique
            while (freq[i] > 0 && seen.contains(freq[i])) {
                freq[i]--;
                ans++;
            }
            // Add the newly occupied frequency to the set
            seen.add(freq[i]);
        }

        return ans;
    }
}