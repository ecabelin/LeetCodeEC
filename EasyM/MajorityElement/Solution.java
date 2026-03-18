/* Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Boyer-Moore Voting Algorithm 
* Often used to find the majority element in linear time and constant space.

# Approach
<!-- Describe your approach to solving the problem. -->
For every instance an element is found, promote it as a candidate.
For every instance an element is not found, demote the candidate.
If the count of the candidate is zero, promote the next element as a new candidate.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n) - We traverse the array once to find the majority element.

// - Space complexity:
// <!-- Add your space complexity here, e.g. $$O(n)$$ -->
O(1) - Two Variables Used, constant space. 

*/
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            }
            else {
                count--;
            }
        }

        return candidate; 
    }
}
