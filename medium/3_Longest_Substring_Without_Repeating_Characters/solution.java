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
                prevSize = (prevSize > snippetSize) ? (prevSize) : (snippetSize);   // determine the new length
                /*
                 * 1. Need to find the last instance of the repeat character in the snippet.
                 * 2. Add all characters after the last instance of the repeat character into the new snippet.
                 * 3. Add to snippetSize respectively.
                 * 4. Finally, consider the "newer" repeat character
                 */
                String temp = snippet.substring(snippet.indexOf(s.charAt(index)) + 1);  // 1 & 2
                snippetSize = temp.length();    // 3

                snippetSize++;  // 4
                snippet = temp + s.charAt(index);   // 2 & 4
            }

            index++;
        }

        return snippetSize = (prevSize > snippetSize) ? (prevSize) : (snippetSize);
    }
}