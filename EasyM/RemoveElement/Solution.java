/*
# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Two Pointer Approach
1. We can use two pointers to keep track of the current position in the array and the
    position where the next non-val element should be placed.

# Approach
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
*/
import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0; 
        int counter = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                counter++;
                k++;
            }
        }

        return counter;
    }
}
