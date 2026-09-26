class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        multimap<int, int> m;
        int i = 0;
        int num1;
        int num2;
        for (int num : nums) {
            m.insert(pair<int,int>(num, i));
            i++;
        }

        for (auto val : m) {
            if (m.contains(target - val.first)) {
                if (val.first == target - val.first && !(m.count(val.first) > 1)) {
                    continue;
                }
                num1 = val.first;
                num2 = target - val.first;
                break;
            }
        }

        vector<int> returnval = {-1,-1};

        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] == num1 && returnval[0] == -1) {
                returnval[0] = i;
            } else if (nums[i] == num2 && returnval[1] == -1) {
                returnval[1] = i;
            }
        }

        if (returnval[0] > returnval[1]) {
            swap(returnval[0], returnval[1]);
        }

        return returnval;
    }
};
