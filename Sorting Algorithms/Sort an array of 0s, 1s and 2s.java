static void swap(int a[],int start,int end)
{
    int temp=a[start];
    a[start]=a[end];
    a[end]=temp;
}
public static void sort012(int a[], int n){
   int start=0;
    int end=n-1;
    int mid=0;
    while(mid<=end)
    {
        if(a[mid]==0)
        {
            swap(a,start,mid);
            start++;
            mid++;
        }
        else if(a[mid]==1)
        {
            mid++;
        }
        else if(a[mid]==2)
        {
           swap(a,mid,end);
           end--;
        }
        
    } 
}
