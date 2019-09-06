/*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I */

class Solution {
    public String convert(String s, int numRows) {
        
        int i=0,j=0,k=0;
        char [][] grid=new char [s.length()][s.length()];
        String abc="";
        if(numRows==1)
        {
            abc=s;
            return abc;
        }
        
        while(k<s.length())
        {
            if(i<numRows-1&&j%(numRows-1)==0)
            {
                grid[i][j]=s.charAt(k);
                //System.out.println(grid[i][j]);
                i++;
            }
            else if((i==numRows-1)&&j%(numRows-1)==0)
            {
                grid[i][j]=s.charAt(k);
                //System.out.println(grid[i][j]);
                i--;
                j++;
            }
            else if(i<numRows-1&&j%(numRows-1)!=0)
            {
                grid[i][j]=s.charAt(k);
                //System.out.println(grid[i][j]);
                i--;
                j++;
            }
            
          k++;
        }
        i=0;
        j=0;
        while(abc.length()!=s.length()&&i<numRows&&j<s.length())
        {
            if(grid[i][j]!='\u0000')
            {
               // System.out.println(" "+i+" "+j);
            abc=abc+grid[i][j];
           // System.out.println(abc);
            }
            
            if(j==s.length()-1)
            {
                j=0;
                i++;
            }
            else
                j++;
           
        }
        
        return abc;
    }
}