
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
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
	        int l=0;
	        int r=n-1;
	        int minl=l;
	        int minr=n-1;
	        int minsum=Integer.MAX_VALUE;
	        Arrays.sort(a);
	        while(l<r)
	        {
	          int sum=a[l]+a[r];
	          if(Math.abs(sum)<Math.abs(minsum))
	          {
	              minsum=sum;
	              minl=l;
	              minr=r;
	          }
	          if(sum<0)
	          {
	              l++;
	          }
	          else
	          {
	              r--;
	          }
	        }
	    System.out.println(minsum);
	    }
	}
}
