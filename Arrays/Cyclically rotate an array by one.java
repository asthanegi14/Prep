class Compute {
    
    public void rotate(int arr[], int n)
    {
        int i=0;
        while(i<n){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
            
            i++;
        }
    }
}
