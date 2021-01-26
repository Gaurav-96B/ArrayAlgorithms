import java.util.*;

class BinarySearch
{
	 
	 public static void main(String args[])
	 {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			 
			int key =sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.bin_search(arr,0,n-1,key));
		T--;
		}
	}
}

// } Driver Code Ends
class GfG
{
	int bin_search(int A[], int left, int right,  int k)
	{
	    int index=-1;
	  while(left<=right)  
	  {
	      int mid=left+(right-left)/2;
	      if(A[mid]==k)
	      {
	          index=mid;
	          break;
	      }
	      else if(A[mid]>k)
	      {
	         right=mid-1; 
	      }
	      else
	      {
	          left=mid+1;
	      }
	  }
	  return index;
	}
}

