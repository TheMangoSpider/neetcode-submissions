class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int min = 0;
        int max = numbers.length - 1;
        int i = 0;
        while (min < max && numbers[min] + numbers[max] != target) {
            if (numbers[min] + numbers[max] > target) {
                max--;
            } else {
                min++;
            }
        }
        if (numbers[min] + numbers[max] == target) {
            return new int[] {min + 1, max + 1};
        }
        return new int[] {};
    }
}
