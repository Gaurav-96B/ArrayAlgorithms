import java.util.*;

class Merge_Sort
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void mergeSort(int arr[], int l, int r)
    {
        GfG g = new GfG();
        if (l < r)
        {
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr , m+1, r);
            g.merge(arr, l, m, r);
        }
    }

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			Merge_Sort ms = new Merge_Sort();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			GfG g = new GfG();
			mergeSort(arr,0,arr.length-1);

			ms.printArray(arr);
		T--;
		}
	}
}


// } Driver Code Ends

/* The task is to complete merge() which is used
in below mergeSort() */
class GfG
{
   // Merges two subarrays of arr[].  First subarray is arr[l..m]
   // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        int i=l;
        int j=m+1;
        int k=0;
        int temp[]=new int[r-l+1];
        while(i<=m&&j<=r)
        {
            if(arr[i]<=arr[j])
            {
                temp[k++]=arr[i];
                i++;
            }
            if(arr[i]>arr[j])
            {
                temp[k++]=arr[j];
                j++;
            }
        }
        while(i<=m)
        {
           temp[k++]=arr[i];
           i++;
        }
        while(j<=r)
        {
          temp[k++]=arr[j];
          j++;
        }
        for(int c=l;c<=r;c++)
{
arr[c]=temp[c-l];
}
        
        
    }
       
        
}
static void mergeSort(int arr[], int l, int r)
 {
    GfG g = new GfG();
    if (l < r)   
   {
        int m = (l+r)/2;
        mergeSort(arr, l, m);
        mergeSort(arr , m+1, r);
        g.merge(arr, l, m, r);
    }
}*/
