class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(0);
            }else{
                int i=st.pop();
                int val;
                if(i==0){
                    val=1;
                }else{
                    val=2*i;
                }
                int p=st.pop();
                st.push(p+val);
            }
        }return st.pop();
    }
}