class Solution {
    public int lengthOfLongestSubstring(String s) {
        int substrStart = 0, substrEnd = 0;
        int index = 0;
        int length = s.length();
        String longestSnippet = "";
        int snippetSize = 0, prevSize = 0;

        // every different char encounter gets appended to a separate string if it did not already exist.
        //      - if exists, discard string, store length of string
        //      - if doesn't exist, add to string, increment stored length of string

        /*
         * Example: abcbcbb, max length is 3 for "abc"
         */
        while (index < length){

        }
        s.charAt(0);

        return substrEnd - substrStart;
    }
}