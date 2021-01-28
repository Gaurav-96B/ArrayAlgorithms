class Peak
{
	public int peakElement(int[] a,int n)
    {
      int start=0,end=n-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
        if((mid==0||a[mid-1]<=a[mid])&&(mid==n-1||a[mid+1]<=a[mid]))
        {
        return mid;
        }
        else if(mid>0&&a[mid-1]>=a[mid])
        {
        end=mid-1;
        }
        else
        {
        start=mid+1;
        }
        }
        return -1;
        }
      
}
