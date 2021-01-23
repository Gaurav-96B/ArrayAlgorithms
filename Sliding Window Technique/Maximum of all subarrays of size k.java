class solve{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        Deque<Integer>q= new LinkedList<Integer>();
        ArrayList<Integer>retVal = new ArrayList<>();
        int i;
        for(i=0;i<k;i++){
            while(!q.isEmpty() && arr[i]>=arr[q.peekLast()])
            q.removeLast();
            q.addLast(i);
        }
        for(i=k;i<n;i++){
            retVal.add(arr[q.peek()]);
            while(!q.isEmpty() && q.peek() <= i-k)
            q.removeFirst();
            while(!q.isEmpty() && arr[i]>=arr[q.peekLast()])
            q.removeLast();
            q.addLast(i);
        }
        retVal.add(arr[q.peek()]);
        return retVal;
        
    }
}
