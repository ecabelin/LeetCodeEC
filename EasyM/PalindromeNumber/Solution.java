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
*/
# Code

class Solution {
    public boolean isPalindrome(int x) {
        int xsize = (int) (Math.log10(x) + 1);
        if (x < 0) { // IF Negative False
            //System.out.printf("NEGATIVE - F");
            return false;
        } 
        if (xsize == 1 || x == 0) {  // IF Single Digit
            //System.out.printf("SINGLE DIGIT - T");
            return true;
        }
        if (x % 10 == 0) { // IF The Right Most Digit Is 0 False
            //System.out.printf("RIGHT 0 - F");
            return false;
        }

        int temp = x; 
        int[] converted = new int[xsize];

        for (int i = 0; i < xsize; i++){ 
            converted[i] = temp % 10;
            temp = temp / 10;
        }
        //System.out.printf("xsize: %d\n", xsize);
        for (int i = 1; i < (xsize / 2) + 1; i++) {
            System.out.printf("%d, %d\n", converted[i-1], converted[xsize - i]);
            if(converted[i-1] != converted[xsize - i]) {
                return false;
            }
        }
        //System.out.printf("Final True Reached");
        return true;
    }
}
