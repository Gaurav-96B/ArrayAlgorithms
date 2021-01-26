
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
	        int found=0;
	        int c=0;
	        int n=sc.nextInt();
	        int givenSum=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	          a[i]=sc.nextInt(); 
	        }
	        Arrays.sort(a);
	        for(int i=0;i<n-2;i++)
	        {
	            int j=i+1;
	            int k=n-1;
	            while(j<k)
	            {
	               int sum=a[i]+a[j]+a[k];
	               if(sum==givenSum)
	               {
	                  found=1;
	                  j++;
	                  k--;
	               }
	               else if(sum<givenSum)
	               {
	                  j++; 
	               }
	               else
	               {
	                 k--;  
	               }
	            }
	        }
	        if(found==0)
	        {
	            System.out.println("0");
	        }
	        else
	        {
	            System.out.println("1");
	        }
	    }
	    }
	}
	
	
