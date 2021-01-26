
import java.util.*;
import java.lang.*;
import java.io.*;

/* 1)Sort according to finish times (in asc order).
   2)If start time of the next activity is greater than or equal to the end time of prev activity
then increment count.
*/

class Gfg {
    
    static class pair
    {
         int start;
         int finish;
    }
    static class CustomSort implements Comparator<pair>
    {
        public int compare(pair p1,pair p2)
        {
            /*if(p1.finish>p2.finish) return 1;
            
            return -1;*/
            return p1.finish-p2.finish;
        }
    }
    public static void main (String[] args)
		{
	    int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    sc.nextLine();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int s[] = new int[n];
	        int f[] = new int[n];
	       for(int i=0;i<n;i++)
	       {
	            s[i]=sc.nextInt();
	       }
	            
	        for(int i=0;i<n;i++)
	        {
	            f[i]=sc.nextInt();
	        }
	            maxMeetings(s,f,n);
	    }
	}
		static void maxMeetings(int s[],int f[],int n)
		{
		   ArrayList<pair>al = new ArrayList<>();
		   for(int i=0;i<n;i++)
		   {
		       pair p = new pair();
		       p.start = s[i];
		       p.finish = f[i];
		       al.add(p);
		       
		   }
		   Collections.sort(al,new CustomSort());
		   
		   int end = Integer.MIN_VALUE;
		   int count =0;
		   for(int i=0;i<al.size();i++)
		   {
		       pair p = al.get(i);
		        if(p.start >= end)
		       {
		          count++;
		          end = p.finish;
		       }
		      
		   }
		   System.out.println(count);
		}
}
