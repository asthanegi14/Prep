class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        int count=0;
        for(int key: map.keySet()){
            if(key == k-key){
                int v = map.get(key);
                count += v*(v-1)/2;
            }
            
            else if(map.containsKey(k-key)){
                count += map.get(key)*map.get(k-key);
                map.put(key, 0);
                map.put(k-key, 0);
            }
        }
        
        return count;
    }
}
