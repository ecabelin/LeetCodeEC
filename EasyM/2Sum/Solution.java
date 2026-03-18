import java.util.HashMap; 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        INPUT: Array nums, int Target
        RETURN: Indices of the two numbers that add up to Target.
        RESTRICTIONS: 
        1. Cannot use the same element twice. 
        2. Every input has exactly one solution.
        3. Indices can be in any order.
        */
        HashMap<Integer, Integer> map = new HashMap<>();  

        int num_count = nums.length;
        // Find the pair for every value.
        // Entry: value, index
        for(int i = 0; i < num_count; i++) { 
            int find = target - nums[i];
            if(map.containsKey(find) && i != map.get(find)){
                int[] solution = {map.get(find), i};
                return solution;
            }
            else { // Insert Map Entries As You Go
                map.put(nums[i], i); // Map Entries based on value
            }
        }
        
        return null;
    }
}