class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        for(int i=0;i<n;i++){
            int val = map.get(arr[i]);
            if(val==1){
                return arr[i];
            }
        }
        return 0;
    }  
    
}
