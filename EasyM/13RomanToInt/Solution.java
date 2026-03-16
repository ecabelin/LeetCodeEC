class Solution {
    public int romanToInt(String s) {
        // I - V - X - L - C - D - M
        // 1 - 5 - 10 - 50 - 100 - 500 - 1000
        int sym_length = s.length();
        int total = 0;
        for (int i = 0; i < sym_length; i++) {
            char selection = s.charAt(i);
            boolean checker = true;
            boolean skip = false;
            
            if(i + 1 == sym_length) {
                checker = false;
            }

            switch(selection) {
                case 'I':
                    // IV : 4
                    if(checker && s.charAt(i+1) == 'V') {
                        total += 4;
                        skip = true;
                    }
                    // IX : 9
                    else if(checker && s.charAt(i+1) == 'X') {
                        total += 9;
                        skip = true;
                    }
                    else {
                        total += 1;
                    }
                    break;
                case 'V':
                    total += 5;
                    break;
                case 'X':
                    // XL : 40
                    if(checker && s.charAt(i+1) == 'L') {
                        total += 40;
                        skip = true;
                    }
                    // XC : 90
                    else if(checker && s.charAt(i+1) == 'C') {
                        total += 90;
                        skip = true;
                    }
                    else {
                        total += 10;
                    }
                    break;
                case 'L':
                    total += 50;
                    break;
                case 'C':
                    // CM : 900 
                    if(checker && s.charAt(i+1) == 'M') {
                        total += 900;
                        skip = true;
                    }
                    // CD : 400
                    else if(checker && s.charAt(i+1) == 'D') {
                        total += 400;
                        skip = true;
                    }
                    else {
                        total += 100;
                    }
                    break;
                case 'D':
                    total += 500;
                    break;
                case 'M':
                    total += 1000;
                    break;
            }

            if (skip && (i + 1 != sym_length)) {
                i += 1;
            }
        }

        return total; 
    }
}