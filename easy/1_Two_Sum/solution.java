class Solution {
    public int[] twoSum(int[] nums, int target) {
        // O(n^2) solution has us iteration and summing every index with every other index.
        int[] solution_set = new int[2];
        int length = nums.length;
        for (int i = 0; i < length; i++){
            for (int j = i + 1; j < length; j++){
                if (nums[i] + nums[j] == target){
                    solution_set[0] = i;
                    solution_set[1] = j;
                }
            }
        }

        // < O(n^2) solution:
        // sort array first?

        return solution_set;
    }
}