class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] output = new int[nums1.length];
        // int i = 0;
        // int one = 0;
        // int two = 0;
        // while (one != nums1.length - 1 || two != nums2.length - 1) {
        //     if (nums1[one] > nums2[two]) {
        //         output[i] = nums[one];
        //         one++;
        //         i++;
        //     } else {
        //         output[i] = nums[two];
        //         two++;
        //         i++;
        //     } 
        // }

        // if ()
        int j = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}