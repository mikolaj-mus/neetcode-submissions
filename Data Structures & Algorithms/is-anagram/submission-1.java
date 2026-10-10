class Solution {
    public boolean isAnagram(String s, String t) {
        // int[] sArray = new int[26];
        // int[] tArray = new int[26];
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char letter : s.toCharArray()) {
            sMap.put(letter, sMap.getOrDefault(letter, 0) + 1);
        }

        for (char letter : t.toCharArray()) {
            tMap.put(letter, tMap.getOrDefault(letter, 0) + 1);
        }
        return sMap.equals(tMap);
    }
}
