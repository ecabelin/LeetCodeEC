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
// ```java []
import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        boolean isHappy = false;
        String log = "";
        int counter = 0;
        
        // Key Tracker
        HashMap<Integer, Integer> cycler = new HashMap<>();
        // Starting w/ Positive
        if(n < 0) {
            return false;
        }

        while(true) {
            counter++; 
            // Initialize Size Repeatedly
            int size = (int) (Math.log10(n) + 1);
            // Initialize Sum Repeatedly
            int sum = 0;

            // For Loop
            for(int i = 0; i < size; i++) {
                log += "System Log Start: Number " + n + "\n";
                sum += (n % 10) * (n % 10);
                n = n / 10;
                log += "System Log: sum " + sum + " | n : " + n + "\n";
            }

            if(sum == 1) {
                isHappy = true;
                break;
            }
            else {
                // Hash Map Entry
                // key | val : sum | n
                if(cycler.containsKey(sum)) {
                    break;
                }
                else {
                    cycler.put(sum, n);
                }
                n = sum;
            }

            if(counter % 10 == 0) {
                System.out.println(log);
            }
        }
        // Replace # by sum of the squares of it's digits.
        // Repeat until the number equals 1 (stays)

        return isHappy;
    }
}
// ```