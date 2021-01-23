
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
	        Map<Integer,Integer>map=new HashMap<>();
	        int currsum=0;
	        int k=0;
	        int i=0;
	        int found=0;
	        while(i!=n)
	        {
	            currsum=currsum+a[i];
	            if(currsum==k)
	            {
	                found=1;
	                break;
	            }
	            if(map.containsKey(currsum-k)==true)
	            {
	                found=1;
	                break;
	            }
	            if(map.containsKey(currsum)==false)
	            {
	                map.put(currsum,1);
	            }
	            else
	            {
	               int z=map.get(currsum);
	               map.put(currsum,z+1);
	            }
	            i++;
	        }
	        if(found==1)
	        {
	            System.out.println("Yes");
	        }
	        else
	        {
	           System.out.println("No");
	        }
	    }
	}
}
	    
