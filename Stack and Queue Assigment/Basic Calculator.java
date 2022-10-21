class Solution {
    public int calculate(String s) {
        s = s.replaceAll(" ","");
        int num = 0;
        char op = '+';
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num = num * 10 + s.charAt(i) - '0';
                if(i!=s.length() - 1){
                    continue;
                }
            }
            if (op == '+') {
                st.push(num);
            }
            if (op == '-') {
                st.push(-num);
            }
            if (op == '*' || op == '/') {
                int tmp = op == '*' ? st.pop() * num : st.pop() / num;
                st.push(tmp);
            }
            op = s.charAt(i);
            num = 0;
        }
        int ret = 0;
        while (!st.empty()) {
            ret += st.pop();
        }
        return ret;
    }
}
