class Solution {
    public boolean isAnagram(String s, String t) 
    {
        //convert to string then sort then convert back and check?
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        String s1 = new String(charS);
        String t1 = new String(charT);
        return s1.equals(t1);
    }
}
