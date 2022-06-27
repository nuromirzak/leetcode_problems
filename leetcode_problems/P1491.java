class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;

        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];

            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
        }

        return ((double) (sum - max - min)) / (salary.length - 2);
    }
}