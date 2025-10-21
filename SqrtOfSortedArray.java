class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n-1;
        int position = n-1;
        while(left<=right){
            int leftSqrt = nums[left] * nums[left];
            int rightSqrt = nums[right] * nums[right];
            if(leftSqrt > rightSqrt){
                result[position--] = leftSqrt;
                left++;
            }
            else{
                result[position--] = rightSqrt;
                right--;
            }
        }
        return result;
    }
}