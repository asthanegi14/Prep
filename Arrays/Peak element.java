class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int ans=-1;
       for(int i=0;i<n;i++){
            if(ans<arr[i]){
                ans = arr[i];
            }
       }
       
       for(int i=0;i<n;i++){
           if(ans == arr[i]){
               return i;
           }
       }
       
       return 0;
    }
}
