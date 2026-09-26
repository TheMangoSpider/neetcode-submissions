class Solution {
   public:
    int lengthOfLongestSubstring(string s) {
        if (s == "") return 0;
        int left = 0;
        int max = 1;
        unordered_set<char> seen;
        for (int right = 0; right < s.length(); ++right) {
            while (seen.count(s[right])) {
                if (max < seen.size()) {
                    max = seen.size();
                }
                seen.erase(s[left]);
                left++;
            }
            seen.insert(s[right]);
        }
        if (max < seen.size()) {
            max = seen.size();
        }
        return max;
    }
};