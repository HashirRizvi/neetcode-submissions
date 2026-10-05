class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int need = target - nums[i];
            if(map1.containsKey(need))
            {
                return new int[]{map1.get(need), i};
            }
            map1.put(nums[i], i);
        }
        return new int[]{};
    }
}
