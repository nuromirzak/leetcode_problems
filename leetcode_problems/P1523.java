class Solution {
    public int countOdds(int low, int high) {
        // Count the number of integers in the range [low, high]
        int count = high - low + 1;

        // If count is even, then one them is even and the other is odd
        // If count is odd, then both of them are even or odd
        if (count % 2 == 0) {
            return count / 2;
        } else {
            return (count / 2) + (low % 2);
        }
    }
}