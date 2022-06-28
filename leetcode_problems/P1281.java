class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0;

        while (n != 0) {
            int curDigit = n % 10;
            product *= curDigit;
            sum += curDigit;
            n /= 10;
        }

        return product - sum;
    }
}