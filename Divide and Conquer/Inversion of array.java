import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    sc.nextLine();
		    while(t-->0)
		    {
		        int n=sc.nextInt();
		        int arr[]=new int[n];
		        for(int i=0;i<n;i++)
		        {
		            arr[i]=sc.nextInt();
		            
		        }
		        System.out.println(mergeSort(arr,0,n-1));
		    }
		    
		}
		
	
	public static long mergeSort(int arr[],int s,int e){
	    long a=0;
	    long b=0;
	    long c=0;
	    if(s<e)
	    {
	    int mid=(s+e)/2;
	     a=mergeSort(arr,s,mid);
	    b=mergeSort(arr,mid+1,e);
	    c=merge(arr,s,mid,e);
	    }
	    return a+b+c;
	    
	    
	    
	}
	public static long merge(int arr[],int s,int mid,int e){
	  int ls=s;
	  int le=mid;
	  int rs=mid+1;
	  int re=e;
	  long count=0;
	  int temp[]=new int[e-s+1];
	  int k=0;
	  while(ls<=mid&& rs<=re){
	      if(arr[ls]<=arr[rs]){
	          temp[k]=arr[ls];
	          k++;ls++;
	      }
	      if(arr[ls]>arr[rs]){
	         temp[k]=arr[rs];
	         count=count+(le-ls+1);
	         k++;rs++;
	          
	      }
	      
	  }
	  while(ls<=le){
	      temp[k]=arr[ls];
	      ls++;k++;
	  }
	  while(rs<=re){
	      temp[k]=arr[rs];
	      rs++;k++;
	  }
	  for(int i=s;i<=e;i++){
	      arr[i]=temp[i-s];
	  }
	  return count;
	}
}
