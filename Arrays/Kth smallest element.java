class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        while(l<r && k!=1){
            l++;
            k--;
        }
        return arr[l];
    } 
}
