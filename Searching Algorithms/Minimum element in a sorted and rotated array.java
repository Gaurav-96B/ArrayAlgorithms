import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    static int minSearch(int a[],int start,int end)
    {
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(a[mid]>a[end])
            {
                start=mid+1;
            }
            else if(a[mid]<=a[end])
            {
                end=mid;
            }
        }
        return a[start];
    }
	public static void main (String[] args) {
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
	        System.out.println(minSearch(a,0,n-1));
	    }
	}
}
