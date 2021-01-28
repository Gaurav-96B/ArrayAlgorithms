import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) throws Exception{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(sc.readLine());
	    while(t-->0){
	        String vals[] = sc.readLine().split(" ");
	        int n = Integer.parseInt(vals[0]);
	        int e = Integer.parseInt(vals[1]);
	        String s[] = sc.readLine().trim().split(" ");
	        int arr[] = new int[n];
	        for(int i=0; i<n; i++){
	            arr[i] = Integer.parseInt(s[i]);
	        }
	        
	        int start=0;
	        int end = n-1;
	        int ans=-1;
	        while(start<=end)
	        {
	            int mid = start + (end-start)/2;
	            if(arr[mid]==e)
	            {
	                ans = 1;
	                break;
	            } else if(e>arr[mid])
	            {
	                start = mid+1;
	            } 
	            else
	            {
	                end = mid-1;
	            }
	        }
	        System.out.println(ans);
	    }
	}
}
