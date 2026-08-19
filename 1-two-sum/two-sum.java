class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Outer loop iterates through each element
        for (int i = 0; i < nums.length; i++) {
            // Inner loop checks the remaining elements after index i
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the two elements add up to the target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // Return an empty array if no solution is found (though the problem guarantees one)
        return new int[] {};
    }
}
