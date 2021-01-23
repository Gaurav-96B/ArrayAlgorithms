
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
	        int k=sc.nextInt();
	        Queue<Integer>q=new LinkedList<>();
	        Queue<Integer>q1=new LinkedList<>();
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]<0)
	            {
	                q.add(a[i]);
	            }
	            q1.add(a[i]);
	            if(i>=k-1)
	            {
	              if(q.isEmpty())
	                     System.out.print("0"+" ");
	             else if(q1.peek()>0)
	               System.out.print(q.peek()+" ");
	             else
	             {
	                 if(q.isEmpty())
	                     System.out.print("0"+" ");
	                 else
	               System.out.print(q.remove()+" "); 
	             }
	             q1.remove();
	            }
	        }
	        System.out.println();
	    }
}
}
	
