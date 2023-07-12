class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int[] ans = new int[n];
        int pos=0, neg=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                neg++;
            }
            ans[i] = arr[i];
        }
        
        int a = n-neg, b=0;
        
        for(int i=0;i<n;i++){
            if(ans[i]<0){
                arr[a++] = ans[i];
            }
            else{
                arr[b++] = ans[i];
            }
        }
    }
}
