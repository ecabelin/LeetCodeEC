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
    public boolean isAnagram(String s, String t) {
        boolean isGram = true;
        if(s.length() != t.length()) {
            return false;
        }

        int n = s.length();

        // Map: Key - character | index
        HashMap<String, Integer> map = new HashMap<>();

        // Map Out S String Characters
        for(int i = 0; i < n; i++) {
            String target = s.substring(i, i+1);
            if(!map.containsKey(target)) {
                map.put(target, 1);
            }
            else {
                int counter = map.get(target);
                map.put(target, counter + 1);
            }
        }

        for(int i = 0; i < n; i++) {
            String target = t.substring(i, i+1);
            if(!map.containsKey(target)) { // target is not in map, 
                return false;
            }
            else if(map.containsKey(target) && map.get(target) == 0) { // target is in map, but overused in t
                return false;
            }
            else {
                int counter = map.get(target);
                System.out.printf("Target: " + target + " | Counter: " + counter +  "\n");
                map.put(target, counter - 1);
                System.out.printf("Target: " + target + " | Counter: " + counter +  "\n");
            }
        }

        return isGram;         
    }
}
