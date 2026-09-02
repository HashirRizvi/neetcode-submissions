class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
        {
            return false;
        }
        int[] location = new int[26];
        for(int i = 0; i < t.length(); i++)
        {
            location[t.charAt(i) - 'a']++;
            location[s.charAt(i) - 'a']--;
        }
        for(int loc : location)
        {
            if(loc != 0)
            {
                return false;
            }
        }
        return true;
    }
}
