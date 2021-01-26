class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	  int start=0;
	    int end=n-1;
	    while(start<end)
	    {
	        if(arr[start]>arr[end])
	        {
	            int temp=arr[start];
	            arr[start]=arr[end];
	            arr[end]=temp;
	            start++;
	            end--;
	        }
	        else if(arr[start]==0)
	        {
	            start++;
	        }
	        else if(arr[end]==1)
	        {
	           end--; 
	        }
	    }
	    return arr;  
	}
} 
