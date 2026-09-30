class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int total = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = total;
            total *= nums[i];
        }

        total = 1;

        for (int i = 0; i < nums.length; i++) {
            output[output.length - i - 1] *= total;
            total *= nums[nums.length - i - 1];
        }

        return output;
    }
}  
