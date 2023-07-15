class Solution {
    public int countStudents(int[] stu, int[] s) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<stu.length;i++){
            q.add(stu[i]);
        }
        for(int i=s.length-1;i>=0;i--){
            st.push(s[i]);
        }
        int n=stu.length*s.length;
        while(n-->0){
            if((!st.isEmpty() && q.peek()==st.peek())){
                st.pop();
                q.poll();
            }
            else{
                if(!q.isEmpty()){
                    q.add(q.poll());
                }
                else{
                    return 0;
                }
            }
        }
        return q.size();
    }
}
