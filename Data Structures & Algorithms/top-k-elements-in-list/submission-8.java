class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frequencies = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (frequencies.containsKey(nums[i])) {
                frequencies.put(nums[i], frequencies.get(nums[i]) + 1);
            } else {
                frequencies.put(nums[i], 1);
            }
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        frequencies.forEach((key, value) -> pq.offer(Map.entry(key, value)));


        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            System.out.println("peek " + pq.peek().getValue() + " then amt: " + pq.peek().getKey());
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}
