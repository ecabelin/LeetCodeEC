/*
# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->

# Approach
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
Needs to be optimized, 112ms time.
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

#Code
*/

import java.util.HashMap;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int order = 0;
        for(int i = 0; i < nums.length; i++) { 
            // If the value does not exist in the map, add it.
            if(!map.containsValue(nums[i])) {
                map.put(order, nums[i]);
                System.out.printf("Key: %d, Value: %d\n", order, nums[i]);
                order++;
            }
        }

        for(int j = 0; j < map.size(); j++) { 
            nums[j] = map.get(j);
        }

        return map.size(); 
    }
}