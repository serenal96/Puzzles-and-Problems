/*Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]*/


class Solution { 
    public List<List<Integer>> generate(int numRows) {
        
        boolean checkodd=true;
        List<Integer> temp=new ArrayList<Integer>();
        int size=1;
        int j=1;
        List<List<Integer>> fin=new ArrayList<List<Integer>>();
        if(numRows>=1)
        {
        temp.add(1);
        fin.add(0,temp);
        size++;
        }
        if(numRows>=2)
        {
        temp=new ArrayList<Integer>();
        temp.add(1);
        temp.add(1);
        fin.add(temp);
        size++;
        }
        if(numRows>=3)
        {
        numRows-=2;
        while(numRows>0)
        {
        j=1;
        temp=new ArrayList<Integer>();
            temp.add(0,1);
            while(j<size-1)
            {
            temp.add(j,(fin.get(fin.size()-1).get(j-1)+fin.get(fin.size()-1).get(j)));
            j++;
            }
        temp.add(1);
        numRows--;
        fin.add(temp);
        size++;
        }
        }
        return fin;
    }
}