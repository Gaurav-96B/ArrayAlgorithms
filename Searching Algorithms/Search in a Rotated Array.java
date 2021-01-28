
import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
    static int minIndex(int a[],int start,int end,int key)
    {
        int index=minSearch(a,0,end,key);
        int z=elementSearch(a,0,index-1,key);
        int z1=elementSearch(a,index,end,key);
        if(z!=-1)
        {
            return z;
        }
        else 
        {
            return z1;
        }
    }
    static int elementSearch(int a[],int start,int end,int key)
    {
        int found=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(a[mid]==key)
            {
                
               found=mid; 
               break;
            }
            else if(key<a[mid])
            {
                end=mid-1;
            }
            else 
            {
                start=mid+1;
            }
        }
        return found;
    }
    static int minSearch(int a[],int start,int end,int key)
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
        return start;
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
	        int key=sc.nextInt();
	        System.out.println(minIndex(a,0,n-1,key));
	    }
	}
}
