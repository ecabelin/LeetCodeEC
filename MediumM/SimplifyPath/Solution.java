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
    public String simplifyPath(String path) {
        int size = path.length(); 
        Stack <String> Directories = new Stack<>();

        // Trackers
        String window = "";   // Directory Logger

        for(int n = 0; n < size; n++) {
            System.out.printf(size + " " + n + " Current Window " + window + "\n");
            // If Invalid . Or Plaintext, include as directory.
            String pointer = path.substring(n, n+1);

            if (!pointer.equals("/")) {
                window += pointer;
            }
             // Don't Include '.'
            if ((n == size - 1 || pointer.equals("/")) && window.equals(".")){
                window = "";
            }
            // Reset Window if "/" & Window is not empty
            else if((n == size - 1 || pointer.equals("/")) && !(window.equals(""))) { 
                // Add Window To Directory Stack
                 // Pop Out Last Pushed Directory If ".."
                if(!Directories.empty() && window.equals("..")) {
                    System.out.printf("Directory Popped: " + Directories.peek() + "\n");
                    Directories.pop();
                }
                
                else if(!window.equals("..")) {
                    // Pop Out Last Pushed Directory If ".."
                    Directories.push(window);
                    System.out.printf("Window Pushed: " + window + "\n");
                }
                window = "";
            }

        }
        // '/' : Start w/ Single Slash
        // 'Separate Directories From /': Don't mind '/'
        // 'Remove Trailing Slashes, no ending with /'
        // Build Simple String
        String simp = "";
        if(Directories.empty()) {
            simp += "/";
        }
        while(!Directories.empty()) {
            String add_dir = Directories.pop();
            simp = "/" + add_dir + simp;
            System.out.printf(add_dir + " " + Directories.size() + "\n");
        }

        
        return simp;
    }
}