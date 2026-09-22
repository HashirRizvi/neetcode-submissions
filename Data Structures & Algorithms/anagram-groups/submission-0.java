class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {

    HashMap<String, List<String>> groupMap = new HashMap<>();

    for (String word : strs) 
    {
        //make word into char array, sort, revert back to string
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String signature = new String(chars);

            //does the map have a list for this signature
        if (!groupMap.containsKey(signature)) 
        {
            //if so, add a list that this word can be connected to
            groupMap.put(signature, new ArrayList<>());
        }
            /*
            add the word or any other words w the same
            signature in the list
            */
            groupMap.get(signature).add(word);
        
    }

    return new ArrayList<>(groupMap.values());
}
}
