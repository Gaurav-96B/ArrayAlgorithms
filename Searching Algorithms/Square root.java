class SquareRoot
{
     long floorSqrt(long x)
	 {
		if(x==1)
		{
		    return 1;
		}
		long start=1;
		long end=x;
		long ans=0;
		while(start<=end)
		{
		   long mid=start+(end-start)/2;
		   if(mid*mid==x)
		   {
		       return mid;
		   }
		   else if(mid*mid<x)
		   {
		       start=mid+1;
		       ans=mid;
		   }
		   else
		   {
		      end=mid-1; 
		   }
		}
		return ans;
	 }
}
