class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";

        for (String s : strs) {
            encoded_string += s + "\n";
        }

        return encoded_string;
    }

    public List<String> decode(String str) {
        Scanner sc = new Scanner(str);
        List<String> output = new ArrayList<>();

        while (sc.hasNextLine()) {
            output.add(sc.nextLine());
        }
        sc.close();
        
        return output;
    }
}
