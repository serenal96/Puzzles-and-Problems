/*Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Note:

Division between two integers should truncate toward zero.
The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.
Example 1:

Input: ["2", "1", "+", "3", "*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
Example 2:

Input: ["4", "13", "5", "/", "+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
Example 3:

Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
Output: 22
Explanation: 
  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22*/

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<Integer>();
        int abc=0;
        for(int i=0;i<tokens.length;i++)
        {
            switch(tokens[i])
            {
                case "+":
                  abc=st.pop();
                  abc=abc+st.pop();
                  st.push(abc);
                    break;
                    
                case "-":
                  abc=st.pop();
                  abc=st.pop()-abc;
                  st.push(abc);
                    break;
                    
                case "*":
                  abc=st.pop();
                  abc=abc*st.pop();
                  st.push(abc);
                    break;
                    
                case "/":
                  abc=st.pop();
                    if(st.peek()==0||abc==0)
                       abc=0;
                    else
                        abc=st.pop()/abc;
                  st.push(abc);
                    break;
                    
                default: st.push(Integer.parseInt(tokens[i]));
                    
                    
            }
            
        }
        return st.pop();
    }
}

/*Runtime: 6 ms, faster than 79.41% of Java online submissions for Evaluate Reverse Polish Notation.
Memory Usage: 36.2 MB, less than 98.00% of Java online submissions for Evaluate Reverse Polish Notation.*/