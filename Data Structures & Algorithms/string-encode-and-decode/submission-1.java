class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";

        for (String s : strs) {
            encoded_string += s + "\n";
        }

        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            String l = "";
            while (str.charAt(i) != '\n') {
                l += str.charAt(i);
                i++;
            }
            output.add(l);
        }
        
        return output;
    }
}
