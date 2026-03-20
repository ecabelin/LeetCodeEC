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
import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        char target;
        // Key: Character, Value: Counter
        for(int i = 0; i < magazine.length(); i++) {
            target = magazine.charAt(i);
            if (map.containsKey(target)) {
                map.put(target, map.get(target) + 1);
            }
            else {
                map.put(target, 1);
            }
            //System.out.printf("%s, %d\n", target, map.get(target));
        } 

        for(int j = 0; j < ransomNote.length(); j++) {
            target = ransomNote.charAt(j);
            if(map.containsKey(target)) {
                if(map.get(target) != 0) {
                    map.put(target, map.get(target) - 1);
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        // Loop Going Through Ransom Note
        return true;
    }
}