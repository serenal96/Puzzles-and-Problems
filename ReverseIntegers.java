/*Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.*/


class Solution {
    public int reverse(int x) {

       if(x==0)
            return 0;
        
        else
        {
           String a="";
            String b="";
            String c="";
            String temp="";
            StringBuffer xy=new StringBuffer(); 
            a=Integer.toString(x);
            
            while(a.charAt(a.length()-1)=='0')
            {
            b=a.substring(0,a.length()-1);
                a=b;
            }
            
            if(a.charAt(0)=='-')
            {
            temp=temp+"-";
            b=a.substring(1,a.length());
            }
            else
                b=a;
            
            xy.append(b);
            xy.reverse();
            //System.out.println(xy);
            c=xy.toString();
            c=temp+c;
            try{
            x=Integer.parseInt(c);  
            }
            catch(Exception e){
                            return 0;

            }
        
        }
        return x;
    }
}