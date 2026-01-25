class Solution {
    
    public void insert(Stack<Integer> st, int temp){
        if(st.isEmpty() || st.peek()<=temp){
            st.push(temp);
            return;
        }
        int val=st.pop();
        insert(st,temp);
        st.push(val);
    }
    
    public void sortStack(Stack<Integer> st) {
       if(!st.isEmpty()){
           int temp=st.pop();
           sortStack(st);
           insert(st, temp);
           
       }
        
    }
}