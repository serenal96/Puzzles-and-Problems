/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5*/

class Solution {
    public int lengthOfLastWord(String s) {
        String lastword=s;
        int index=-1;
        while(lastword.contains(" "))
        {
            index=s.indexOf(" ");
            if(lastword.charAt(s.length()-1)==' ')
            lastword=s.substring(0,s.length()-1);

            else
            lastword=s.substring(index+1,s.length());
            s=lastword;
        }
        return s.length();
    }
}