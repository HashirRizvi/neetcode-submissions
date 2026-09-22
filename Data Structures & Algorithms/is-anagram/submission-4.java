class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();

    if (s.length() != t.length()) {
        return false;
    }

    for (int i = 0; i < s.length(); i++) {
        char char1 = s.charAt(i);
        char char2 = t.charAt(i);

        map1.put(char1,map1.getOrDefault(char1, 0) + 1);
        map2.put(char2,map2.getOrDefault(char2, 0) + 1);
    }

    return map1.equals(map2);
}
}
