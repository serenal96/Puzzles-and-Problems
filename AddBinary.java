/*Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"*/

class Solution {
    public String addBinary(String a, String b) {
        String fin="";
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
    
        while(i>=0&&j>=0)
        {
            if(Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(j))+carry==3)
                {
               fin=1+fin;
                carry=1;
                    }
                if((Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(j))+carry)==2)
                {
               fin=0+fin;
                carry=1;
                    }
            
            else if (Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(j))==1)
            {
                if(carry==0)
                    fin=1+fin;
                else if(carry==1)
                {
                    fin=0+fin;
                    carry=1;
                }
            }
            else if (Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(j))==0)
            {
                if(carry==1)
                {
                    fin=1+fin;
                    carry=0;
                }
                else if(carry==0)
                {
                    fin=0+fin;
                    //carry==1
                }
            }
            if(i>-1)
                i--;
            
              if(j>-1)
                 j--;
            
        }  
        if(i>=0)
        {
            while(i>=0)
            {
         if(Character.getNumericValue(a.charAt(i))+carry==2)
         {
             fin=0+fin;
                    carry=1;
         }
                else if(carry==0)
                {
                    fin=Character.getNumericValue(a.charAt(i))+fin;
                }
                else if(carry==1)
                    {
                    fin=carry+fin;
                    carry=0;
                }
                i--;
            }
        }
        if(j>=0)
        {
            while(j>=0)
            {
         if(Character.getNumericValue(b.charAt(j))+carry==2)
         {
             fin=0+fin;
                    carry=1;
         }
                else if(carry==0)
                {
                    fin=Character.getNumericValue(b.charAt(j))+fin;
                }
                else if(carry==1)
                    {
                    fin=carry+fin;
                    carry=0;
                }
                j--;
            }
        }
        if(carry==1)
        fin=carry+fin;
        return fin;
    }
}