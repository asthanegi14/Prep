class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        
        return new pair(min, max);
    }
}
