
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
	        int x=sc.nextInt();
	        int start=0;
	        int end=n-1;
	        int sum=0;
	        int found=0;
	        while(start<end)
	        {
	           sum=a[start]+a[end];
	           if(sum==x)
	           {
	               found=1;
	             System.out.println(a[start]+" "+a[end]+" "+x); 
	             start++;
	             end--;
	           }
	           else if(sum>x)
	           {
	              end--; 
	           }
	           else
	           {
	              start++; 
	           }
	        }
	        if(found==0)
	        {
	            System.out.println("-1");
	        }
	    }
	}
}
