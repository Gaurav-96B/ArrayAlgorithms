class GfG {
    public int findExtra(int a[], int b[], int n) {
        int left=0;
        int right=b.length-1;
        int index=b.length;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(b[mid]==a[mid])
            {
               left=mid+1; 
            }
            else
            {
              index=mid;
              right=mid-1;
            }
        }
        return index;
    }
}
