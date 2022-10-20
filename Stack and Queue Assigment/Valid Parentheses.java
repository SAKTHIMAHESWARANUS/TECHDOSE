class Solution {
    public boolean isValid(String s) {
        Stack<Character> sakthi=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{'|| c=='('|| c=='['){
                sakthi.push(c);
            }
            else if(c==')' && !sakthi.isEmpty() && sakthi.peek()=='('){
                sakthi.pop();
            }
            else if(c==']' && !sakthi.isEmpty() && sakthi.peek()=='['){
                sakthi.pop();
            }else if(c=='}' && !sakthi.isEmpty() && sakthi.peek()=='{'){
                sakthi.pop();
            }
            else{
                    return false;
            }
        }
        return sakthi.isEmpty();
    }
}
