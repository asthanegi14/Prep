class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans=0;
        
        for(int i=0;i<n;i++){
            arr[i] = (arr[i]==0)?-1:1;
        }
        int s=0;
        map.put(s, 1);
        
        for(int i=0;i<n;i++){
            s+=arr[i];
            if(map.containsKey(s)){
                ans += map.get(s);
                map.put(s, map.getOrDefault(s, 0)+1);
            }
            else{
                map.put(s, 1);
            }
        }
        
        return ans;
    }
}
