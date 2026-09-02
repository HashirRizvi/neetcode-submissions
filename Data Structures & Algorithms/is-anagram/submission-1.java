class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }

        int[] an = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            an[s.charAt(i) - 'a']++;
            an[t.charAt(i) - 'a']--;

        }
        for(int a : an)
        {
            if(a != 0)
            return false;
        }
        return true;
    }
}
