class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int[] dpNoDelete = new int[n];
        int[] dpOneDelete = new int[n];
        dpNoDelete[0] = arr[0];
        dpOneDelete[0] = 0;
        int maxSum = arr[0];
        for (int i = 1; i < n; i++) {
            dpNoDelete[i] = Math.max(dpNoDelete[i - 1] + arr[i], arr[i]);
            dpOneDelete[i] = Math.max(dpNoDelete[i - 1], dpOneDelete[i - 1] + arr[i]);
            maxSum = Math.max(maxSum, Math.max(dpNoDelete[i], dpOneDelete[i]));
        }
        return maxSum;
    }
}
