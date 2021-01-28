class GfG {
    int transitionPoint(int arr[], int n) 
    {
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if((arr[mid]==1&&mid==0)||(arr[mid]==1&&arr[mid-1]==0))
            {
                return mid;
            }
            else if(arr[mid]==0)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
}

