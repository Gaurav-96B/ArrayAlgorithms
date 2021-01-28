import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args){
	    int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    sc.nextLine();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        int start=0;
	        int end=n-1;
	        int found=-1;
	        while(start<=end)
	        {
	            int mid=start+(end-start)/2;
	            if((a[mid]==0&&mid==0)||(a[mid]==0&&a[mid-1]==1))
	            {
	                found=n-mid;
	                break;
	            }
	            else if(a[mid]==1)
	            {
	                start=mid+1;
	            }
	            else
	            {
	                end=mid-1;
	            }
	        }
	        System.out.println(found);
	    }
	    
	}
}
