/*
# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->

# Approach
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
*/
//```java []
class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        boolean start = false;
        int counter = 0;
        
        for(int i = n - 1; i >= 0; i--) {
            boolean space = s.substring(i, i+1).equals(" ");
            if(!space) {
                start = true;
            }

            if(start && !space) {
                counter++;
            }
            else if(start && (space)) {
                break;
            }
        }

        return counter;
    }
}
//```