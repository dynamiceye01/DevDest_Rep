public class Solution {
    public int solve(String A) {
        int n=A.length();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            char c=A.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                stack.push(c);
           
               else if(c==')' && !stack.isEmpty() && stack.peek()=='(')
                    stack.pop();
                else if(c=='}' && !stack.isEmpty() && stack.peek()=='{')
                    stack.pop();
                else  if(c==']' && !stack.isEmpty() && stack.peek()=='[')
                    stack.pop();
                else
                    return 0;
    
        }
        System.out.println("Stack");
        if(stack.isEmpty())
            return 1;
        else 
            return 0;
    }
}
