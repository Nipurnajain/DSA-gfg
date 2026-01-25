class Solution {
    
    public static void insertAtBottom(Stack<Integer> st, int temp){
        if(st.isEmpty()){
            st.push(temp);
            return;
        }
        int val=st.pop();
        insertAtBottom(st, temp);
        st.push(val);
    }
    
    public static void reverseStack(Stack<Integer> st) {
        if(!st.isEmpty()){
            int temp=st.pop();
            reverseStack(st);
            insertAtBottom(st, temp);
        }
        
    }
}
