class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } 
        Arrays.sort(nums);
        int max = 1;

        int tempmax = 1;
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] - nums[i - 1] == 1) {
                tempmax++;
            } else {
                if (tempmax > max) {
                    max = tempmax;
                }
                tempmax = 1;
            }
        }
        if (tempmax > max) {
            max = tempmax;
        }
        return max;
    }
}
