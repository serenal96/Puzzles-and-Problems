/*You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.*/


class Solution {
    public int arrangeCoins(int n) {
        int rows=0;
        int curr=1;
        while(n>0)
        {
            if(n>=curr)
            {
            n=n-curr;
            rows++;
            curr++;
            }
            else
            {
                n=0;
            }
            
        }
        return rows;
    }
}