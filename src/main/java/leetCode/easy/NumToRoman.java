package leetCode.easy;

public class NumToRoman {
    /*public String intToRoman(int num) {
        HashMap<Character, Integer> number = new HashMap <> ();
        number.put('I', 1);
        number.put('V', 5);
        number.put('X', 10);
        number.put('L', 50);
        number.put('C', 100);
        number.put('D', 500);
        number.put('M', 1000);


        return "string out";
    }*/


    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] div = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < div.length; i++) {
            if (num >= div[i]) {
                sb.append(roman[i]);
                num -= div[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        NumToRoman numToRoman = new NumToRoman();
        System.out.println(numToRoman.intToRoman(421));
    }
}