
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    triplets(arr,n);
		}
	}
	static void triplets(int arr[],int n){
	    Arrays.sort(arr);
	    int count=0;
	    for(int i=n-1;i>=0;i--)
	    {
	        int j=0,k=i-1;
	        while(j<k){
	            if(arr[i]==arr[j]+arr[k]){
	                count++;
	                j++;
	                k--;
	            }
	            else if(arr[i]>arr[j]+arr[k])
	            j++;
	            else
	            k--;
	        }
	    }
	    if(count!=0)
	    System.out.println(count);
	    else
	    System.out.println(-1);
	}
}
