/*Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.*/

class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        if(x<0)
            return false;
        
    else
    {
        int rev=0;
        int count=0;
        while(x>0)
        {
         rev=rev*10+(int)((x%10));  
          System.out.println(rev);
            if(x%10>0)
            count++;  
          x=x/10;
        }
        if(y==rev)
            return true;
        else
            return false;
    }
    }
}