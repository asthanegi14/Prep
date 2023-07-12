class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int[] a = new int[n];
        
        for(int i=0;i<n;i++){
            a[arr[i]]++;
        }
        
        for(int i=0;i<n;i++){
            if(a[i]>1){
                ans.add(i);
            }
        }
        if(ans.size()==0){
            ans.add(-1);
        }
        return ans;
    }
}
