/*Implement pow(x, n), which calculates x raised to the power n (xn).

Example 1:

Input: 2.00000, 10
Output: 1024.00000
Example 2:

Input: 2.10000, 3
Output: 9.26100
Example 3:

Input: 2.00000, -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
Note:

-100.0 < x < 100.0
n is a 32-bit signed integer, within the range [−231, 231 − 1]*/


class Solution {
    public double myPow(double x, int n) {
        double result=1;
        long inter=n;
        boolean neg=false;
        if(n==0||x==1)
            return 1;
        else if(n==1)
            return x;
        else if(x==-1)
        {
            if(x==-1)
            {
                if(n%2==0)
                    return 1;
                else
                    return x;
            }
                
        }
        else {
            if(inter<0)
            {
                inter=Math.abs(inter);
                neg=true;
            }
            while(inter>0)
            {
                result=result*x;
                inter--;
            }
        }

if(neg==true)
{
    //System.out.println(result);
    return 1/result;
}       
else
    return result;
        
    }
}

