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
	        int maxValue=0;
	        int sum=0;
	        int windowStart=0;
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        int givenSum=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	            sum=sum+a[i];
	            while(sum>givenSum)
	            {
	                sum=sum-a[windowStart];
	                windowStart++;
	            }
	            if(sum<=givenSum)
	            {
	                maxValue=Math.max(maxValue,sum);
	            }
	        }
	        System.out.println(maxValue);
	    }
	}
}
