
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
	      int k=sc.nextInt();
	      for(int i=0;i<n;i++)
	      {
	          a[i]=sc.nextInt();
	      }
	      Map<Integer,Integer>map=new HashMap<>();
	      int currsum=0;
	      int maxlen=0;
	      int i=0;
	      while(i!=n)
	      {
	          currsum=currsum+a[i];
	          if((((currsum % k) + k) % k)==0)
	          {
	             maxlen=i+1; 
	          }
	          if(map.containsKey(((currsum % k) + k) % k)==true)
	          {
	             if((i-map.get(((currsum % k) + k) % k))>maxlen)
	             {
	                 maxlen=i-map.get(((currsum % k) + k) % k);
	             }
	          }
	          if(map.containsKey(((currsum % k) + k) % k)==false)
	          {
	              map.put((((currsum % k) + k) % k),i);
	          }
	          i++;
	      }
	      System.out.println(maxlen);
	    }
	}
}
