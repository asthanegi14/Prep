class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> arr = new HashSet<>();
        for(int i=0;i<n;i++){
            arr.add(a[i]);
        }
        
        for(int i=0;i<m;i++){
            arr.add(b[i]);
        }
        return arr.size();
    }
}
