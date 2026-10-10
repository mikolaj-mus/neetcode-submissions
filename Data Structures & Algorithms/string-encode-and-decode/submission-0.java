class Solution {
    int[] prefix;
    public String encode(List<String> strs) {
        this.prefix = new int[strs.size()];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            prefix[i] = i > 0 ? 
            strs.get(i).length() + prefix[i-1] : 
            strs.get(i).length();
            sb.append(strs.get(i));
        }
        return sb.toString();
    }
    // [4,8,12,15]
    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int start = 0;
        for (int len : this.prefix) {
            res.add(str.substring(start, len));
            start = len;
        }
        return res;
    }
}
