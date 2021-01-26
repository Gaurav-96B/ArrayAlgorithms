
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
	        int x=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        Arrays.sort(a);
	        int count=0;
	        for(int i=0;i<n-2;i++)
	        {
	         int j=i+1;
	         int k=n-1;
	         while(j<k)
	         {
	            int sum=a[i]+a[j]+a[k];
	           if(sum>=x)
	            {
	                k--;
	            }
	            else
	            {
	                count=count+(k-j);
	                j++;
	            }
	         }
	            
	        }
	        System.out.println(count);
	        
	    }
	    
	}
}
