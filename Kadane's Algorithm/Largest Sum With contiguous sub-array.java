class Kadane
{
    int maxSubarraySum(int arr[], int n)
    { 
        int currSum=arr[0];
        int ovrSum=arr[0];
        for(int i=1;i<n;i++)
        {
            if(currSum>=0)
            {
                currSum=currSum+arr[i];
            }
            else
            {
                currSum=arr[i];
            }
            if(currSum>ovrSum)
            {
                ovrSum=currSum;
            }
        }
        return ovrSum;
        
    }
    
}

