class Solution {
    public int romanToInt(String s) {
        int value = 0;
        HashMap<String, Integer> possibleValues = new HashMap<>();

        // 1 char
        possibleValues.put("I", 1);
        possibleValues.put("V", 5);
        possibleValues.put("X", 10);
        possibleValues.put("L", 50);
        possibleValues.put("C", 100);
        possibleValues.put("D", 500);
        possibleValues.put("M", 1000);

        // 2 chars
        possibleValues.put("II", 2);
        possibleValues.put("IV", 4);
        possibleValues.put("VI", 6);
        possibleValues.put("IX", 9);
        possibleValues.put("XL", 40);
        possibleValues.put("XC", 90);
        possibleValues.put("CC", 200);
        possibleValues.put("CD", 400);
        possibleValues.put("DC", 600);
        possibleValues.put("CM", 900);
        possibleValues.put("XX", 20);

        // 3 chars
        possibleValues.put("III", 3);
        possibleValues.put("VII", 7);
        possibleValues.put("XXX", 30);
        possibleValues.put("LXX", 70);
        possibleValues.put("CCC", 300);
        possibleValues.put("DCC", 700);

        // 4 chars
        possibleValues.put("VIII", 8);
        possibleValues.put("LXXX", 80);
        possibleValues.put("DCCC", 800);

        // Parsing
        while (s.length() > 0) {
            for (int len = 4; len >= 1; len--) {
                if (s.length() >= len && possibleValues.containsKey(s.substring(0, len))) {
                    value += possibleValues.get(s.substring(0, len));
                    s = s.substring(len);
                    break;
                }
            }
        }
        return value;
    }
}