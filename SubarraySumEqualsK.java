class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3, 4, 7, 2, -1, 4, 2};
        int k = 7;
        int result = solution.subarraySum(arr, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}
