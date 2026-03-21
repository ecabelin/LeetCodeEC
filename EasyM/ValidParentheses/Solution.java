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
import java.util.*;

class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        Stack<Character> chars = new Stack<>();
        
        // <---- Input Validation ---->
        for (int j = 0; j < n; j++) {
            char tracked = s.charAt(j);

            // Open Bracket Cases
            if(tracked == '(' || tracked == '{' || tracked == '[') {
                // Push Open Brackets In
                chars.push(tracked);
                System.out.printf(j + " Pushed: " + tracked + "\n");
            }

            // Closed Bracket Cases
            else {
                // Very if Corresponding Open Bracket is in list
                if(!chars.empty()) { // If an opening bracket does not exist
                    // System.out.printf(j + " Popped: " + chars.peek() + "\n");
                    char popped = chars.pop();
                    // System.out.printf(popped + " " + tracked + "\n");
                    if(tracked == ')' && popped != '(') {
                        return false;
                    }
                    else if(tracked == '}' && popped != '{') {
                        return false;
                    }
                    else if(tracked == ']' && popped != '[') {
                        return false;
                    }
                } 
                else { // Closed Bracket w/ no prospects
                    return false;
                }
            }
        }

        if (!chars.empty()) { // Unmatched Open Brackets
            return false;
        }
        return true;

    }
}
