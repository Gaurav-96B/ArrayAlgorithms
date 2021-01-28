class Solution {
    static int maxElement(int a[],int left,int right)
    {
        if(left==right)
        {
            return a[left];
        }
        if((left==right+1)&&a[left]>a[right])
        {
           return a[left];
        }
        if((left==right+1)&&a[left]<a[right])
        {
            return a[right];
        }
        int mid=left+(right-left)/2;
        if(a[mid]>a[mid+1]&&a[mid]>a[mid-1])
        {
            return a[mid];
        }
        else if(a[mid]>a[mid+1]&&a[mid]<a[mid-1])
        {
            return maxElement(a,left,right-1);
        }
        else
        {
           return maxElement(a,left+1,right);
        }
    }
    int findMaximum(int[] arr, int n) {
       return maxElement(arr,0,n-1);
    }
}
