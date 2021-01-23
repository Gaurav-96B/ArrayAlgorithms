
class GfG {
    void countDistinct(int A[], int k, int n) {
            Map<Integer,Integer>map=new LinkedHashMap<>();
            int count;
            for(int i=0;i<n;i++)
            {
                if(map.containsKey(A[i])==false)
                {
                    map.put(A[i],1);
                }
                else
                {
                    int z0=map.get(A[i]);
                     int z1=z0+1;
                    map.put(A[i],z1);
                }
                if(i>=k-1)
                {
                   int z=map.size();
                   System.out.print(z+" ");
                   count=map.get(A[i-(k-1)]);
                   if(count>1)
                   {
                      map.put((A[i-(k-1)]),count-1);
                   }
                   else
                   {
                       map.remove(A[i-(k-1)]);
                   }
                   
                }
            }
        }
        
}
