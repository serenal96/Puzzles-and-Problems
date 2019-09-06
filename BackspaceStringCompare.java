/*Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.*/



class Solution {
    public boolean backspaceCompare(String S, String T) {
        String inter="";
       // boolean check=true;
        while(S.contains("#"))
        {
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='#')
            {
                if(i==0)
                {
                inter=S.substring(1,S.length());
                S=inter;
                }
                else
                {
                inter=S.replace(S.substring(i-1,i+1),"");
                S=inter;
                }
                break;
               // System.out.println(S);
            }   
        }
        }
        while(T.contains("#"))
        {
        for(int i=0;i<T.length();i++)
        {
            if(T.charAt(i)=='#')
            {
                if(i==0)
                {
                inter=T.substring(1,T.length());
                T=inter;
                }
                else
                {
                inter=T.replace(T.substring(i-1,i+1),"");
                T=inter;
                }
                break;
                //System.out.println(T);
            }   
        }
        }
        
        if(S.equals(T))
        return true ;
        else
            return false;
    }
}