
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int t;
	    Scanner sc=new Scanner (System.in);
	    t=sc.nextInt();
	    sc.nextLine();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int k=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        int sum=0;
	        int max1=Integer.MIN_VALUE;
	        for(int i=0;i<n;i++)
	        {
	            sum=sum+a[i];
	            if(i>=k-1)
	            {
	               max1= Math.max(max1,sum);
	              sum=sum-a[i-(k-1)];
	            }
	        }
	        System.out.println(max1);
	    }
	    
}
}
