import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // create value mapping for the roman numerals
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;

        for (int index = 0; index < s.length(); index++){
            char val = s.charAt(index);
            if ((index < s.length() - 1) && values.get(val) < values.get(s.charAt(index + 1))){
                total -= values.get(val);
            }
            else{
                total += values.get(val);
            }
        }

        return total;
    }
}