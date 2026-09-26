class Solution {
public:
    bool isAnagram(string s, string t) {
        while (s != "") {
            if (!t.contains(s[0])) {
                return false;
            }
            t.erase(t.find(s[0]), 1);
            s = s.substr(1);
        }
        return t == ""; 
    }
};
