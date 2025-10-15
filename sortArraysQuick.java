class Solution {
    Random rand = new Random();

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotIndex = low + rand.nextInt(high - low + 1);
            swap(nums, low, pivotIndex);
            int partitionIndex = partition(nums, low, high);
            quickSort(nums, low, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, high);
        }
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int left = low + 1;
        int right = high;
        while (left <= right) {
            while (left <= high && nums[left] <= pivot) left++;
            while (right > low && nums[right] > pivot) right--;
            if (left < right) swap(nums, left, right);
        }
        swap(nums, low, right);
        return right;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}