import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder(); // we use string builder for its speed and efficiency in building strings char by char
        /*
         * 1. sort strs lexicographically so that common prefixes appear together
         * 2. Compare the first and last elements in the sorted array
         * 3. Store same characters into prefix, first non-matching character exits.
         */
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int size = (first.length() > last.length()) ? last.length() : first.length();
        for (int i = 0; i < size; i++){
            if (first.charAt(i) == last.charAt(i)){
                prefix.append(first.charAt(i));
            }
            else{
                break;
            }
        }
        return prefix.toString();
    }
}