class Solution {
    /*
        P     I    N         [R-0]      (3-0)*2  (0-0)*2
        A   L S  I G         [R-1]      (3-1)*2  (0-1)*2
        Y A   H R            [R-2]      (3-2)*2  (0-2)*2
        P     I              [R-3]      (3-3)*2  (0-3)*2
    */
    public String convert(String s, int numRows) {
        if (numRows <= 1 || s.length() <= numRows) return s;
        StringBuilder convertedString = new StringBuilder();
        int maxIndex = s.length() - 1;
        int direction;
        int steps;
        int position;

        for (int i = 0; i < numRows; i++) {
            position = i;
            direction = -1;
            convertedString.append(s.charAt(position));
            
            while (position <= maxIndex) {
                switch (direction) {
                    case -1: {
                        steps = ((numRows - 1) - i) * 2;
                        if (steps > 0) {
                            position += steps;
                            if (position <= maxIndex) {
                                convertedString.append(s.charAt(position));
                            }
                        }
                        direction = 1;
                    }
                    break;
                    case 1: {
                        steps = Math.abs(-i) * 2;   // 0 - i
                        if (steps > 0) {
                            position += steps;
                            if (position <= maxIndex) {
                                convertedString.append(s.charAt(position));
                            }
                        }
                        direction = -1;
                    }
                    break;
                }
            }
        }
        return String.valueOf(convertedString);
    }

}