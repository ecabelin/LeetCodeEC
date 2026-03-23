// # Intuition
// <!-- Describe your first thoughts on how to solve this problem. -->

// # Approach
// <!-- Describe your approach to solving the problem. -->

// # Complexity
// - Time complexity:
// <!-- Add your time complexity here, e.g. $$O(n)$$ -->

// - Space complexity:
// <!-- Add your space complexity here, e.g. $$O(n)$$ -->

// # Code

import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        boolean isIso = true;
        if(s.length() != t.length()) {
            return false;
        }        
        
        int n = s.length();
        HashMap<Character, Character> map = new HashMap<>(); 
        // Conditions
        // Log [Character | Mapped Character] : Mapped Character Must Stay The Same
        for(int i = 0; i < n; i++) {
            char target = s.charAt(i);
            char pair = t.charAt(i);
            boolean containsS = map.containsKey(target);
            boolean containsT = map.containsValue(pair);
            // Case 1: s AND t are not logged
            if(!containsS && !containsT) {   // If s AND t are not logged 
                map.put(target, pair);   // Log s into map
            } 
            // Case 1: s and t are logged, and we are running into an existing pair 
            else if((containsS && containsT) && map.get(target) == (pair)) {
                continue;
            }
            // Case 2: s and t are logged, and we are attempting to add another match
            else if((containsS && containsT) && !(map.get(target) == (pair))) {
                return false;
            }
            // Case 2: Only s is logged
            else if(containsS && !containsT) { 
                return false; // s is attempting to map to another t.
            }

            // Case 3: Only t is logged
            else if(containsT && !containsS) {
                return false; // t is attempting to map to another s.
            }

        }

        return true;
        
    }
}