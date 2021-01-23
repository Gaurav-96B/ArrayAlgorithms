
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
	        int startIndex=0;
	        int endIndex=0;
	        int windowStart=0;
	        int sum=0;
	        int n=sc.nextInt();
	        int givenSum=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	           a[i]=sc.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	          sum=sum+a[i];
	          while(sum>givenSum)
	          {
	             sum=sum-a[windowStart];
	             windowStart++;
	          }
	          if(sum==givenSum)
	          {
	              found=1;
	             endIndex=i+1;
	             startIndex=windowStart+1;
	             break;
	             
	          }
	          
	        }
	        if(found==1)
	        {
	        System.out.println(startIndex+" "+endIndex);
	        }
	        else
	        {
	            System.out.println("-1");
	        }
	    }
	}
}
