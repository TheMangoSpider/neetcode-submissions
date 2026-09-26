class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        set<int> set1;
        for (int num : nums) {
            if (set1.contains(num)) {
                return true;
            }
            set1.insert(num);
        }
        return false;
    }
};