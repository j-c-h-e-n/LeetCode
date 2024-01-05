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
                //System.out.println("adding to snippet");
                snippet += s.charAt(index);
                snippetSize++;
            }
            else{
                // if snippet DOES contain character
                //System.out.println("restarting snippet");
                prevSize = (prevSize > snippetSize) ? (prevSize) : (snippetSize);
                snippetSize = 1;
                snippet = "" + s.charAt(index);
            }

            index++;
        }
 
        return snippetSize = (prevSize > snippetSize) ? (prevSize) : (snippetSize);
    }
}