class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<op.length;i++){
            if(op[i].equals("C") && !st.isEmpty()){
                st.pop();
            }
            else if(op[i].equals("D") && !st.isEmpty()){
                st.push(st.peek()*2);
            }
            else if(op[i].equals("+")){
                int pop1 = 0;
                pop1 = st.isEmpty() ? 0:st.pop();
                int pop2 = 0;
                pop2 = st.isEmpty() ? 0:st.pop();
                int sum = pop1+pop2;

                st.push(pop2);
                st.push(pop1);
                st.push(sum);
            }
            else{
                st.push(Integer.valueOf(op[i]));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}
