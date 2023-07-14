
class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        int j=0, k=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                neg.add(arr[i]);
            }
            else{
                pos.add(arr[i]);
            }
        }
        int s1 = pos.size(), s2 = neg.size(); 
        int i=0;
        j=0; k=0;
        
        // System.out.println(pos+" "+neg);
        while(j<s1 && k<s2){
            arr[i++]=pos.get(j);
            arr[i++] = neg.get(k);
            j++;k++;
        }
        while(j<s1){
            arr[i++]=pos.get(j);
            j++;
        }
        
        while(k<s2){
            arr[i++] = neg.get(k);
            k++;
        }
    }
}
