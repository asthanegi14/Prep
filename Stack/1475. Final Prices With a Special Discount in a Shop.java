class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[n-1] = prices[n-1];
        int i=n-2;
        st.push(ans[n-1]);

        while(i>=0){
            while(!st.isEmpty() && st.peek()>prices[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = prices[i];
            }
            else{ 
                int diff = prices[i] - st.peek();
                ans[i] = diff;
            }
            st.push(prices[i]);
            i--;
        }
        return ans;
    }
}
