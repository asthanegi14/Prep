class Solution{
    int findFrequency(int A[], int x){
        int ans=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==x){
                ans++;
            }
        }
        return ans;
    }
}
