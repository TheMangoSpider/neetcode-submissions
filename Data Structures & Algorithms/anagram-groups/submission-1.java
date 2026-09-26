class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String cString = Arrays.toString(c);
            if (m.containsKey(cString)) {
                m.get(cString).add(s);
            } else {
                List<String> toAdd = new ArrayList<>();
                toAdd.add(s);
                m.put(cString, toAdd);
            }
        }

        List<List<String>> result = new ArrayList<>();

        m.forEach((key, value) -> result.add(value));
        return result;
    }
}
