class Solution {
    public int lengthOfLongestSubstring(String s) {
        int index = 0;
        int length = s.length();
        String snippet = "";
        int snippetSize = 0, prevSize = 0;

        // every different char encounter gets appended to a separate string if it did not already exist.
        //      - if exists, discard string, store length of string
        //      - if doesn't exist, add to string, increment stored length of string

        /*
         * Example: abcbcbb, max length is 3 for "abc"
         */
        while (index < length){
            if (!snippet.contains(""+s.charAt(index))){
                // if snippet does not contain character
                snippet += s.charAt(index);
                
            }
            else{
                // if snippet DOES contain character
                prevSize = snippetSize;
                snippetSize = 0;
                snippet = "";
            }

            index++;
        }
        s.charAt(index);

        return snippetSize = (prevSize > snippetSize) ? (prevSize) : (snippetSize);
    }
}