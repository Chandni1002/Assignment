public class RomanToIntConverter {

    public int romanToInt(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));
            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));
                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    res = res - s1;
                }
            } else {
                res = res + s1;
            }
        }
        return res;
    }

    private int value(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        RomanToIntConverter converter = new RomanToIntConverter();
        String romanNumeral = "XIV"; 
        int intValue = converter.romanToInt(romanNumeral);
        System.out.println("Roman Numeral: " + romanNumeral);
        System.out.println("Integer Value: " + intValue);
    }
}
