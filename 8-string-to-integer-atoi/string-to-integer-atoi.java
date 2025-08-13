class Solution {
    public int myAtoi(String s) {
        boolean isPositive = true;
        boolean acceptSign = true;
        StringBuilder sb = new StringBuilder();
        int value = 0;

        outer:
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ' ': {
                    if (sb.isEmpty() && acceptSign){
                    continue;
                    }else {
                        break outer;
                    }
                }
                case '-': {
                    if (sb.isEmpty() && acceptSign) {
                        isPositive = false;
                        acceptSign = false;
                    } else {
                        break outer;
                    }
                }
                break;
                case '+' : {
                    if (sb.isEmpty() && acceptSign) {
                        acceptSign = false;
                    } else {
                        break outer;
                    }
                }
                break;
                default: {
                    int ascii = (int) s.charAt(i);
                    if (ascii >= 48 && ascii <= 57) {
                        sb.append(s.charAt(i));
                    } else {
                        break outer;
                    }
                }
            }
        }

        // "001278"   "42"
        while (!sb.isEmpty() && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        int start = 0;
        while (start < sb.length()) {
            int digit = sb.charAt(start) - '0';
            if ((((long) value * 10) + digit) > Integer.MAX_VALUE) {
                return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            value = digit == 0 ? value * 10 : value * 10 + digit;
            start++;
        }
        if (isPositive) return value;
        return value * -1;
    }

}