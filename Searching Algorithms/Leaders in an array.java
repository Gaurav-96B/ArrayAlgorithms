class Leader{
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer>a=new ArrayList<>();
        int maxFromRight=arr[n-1];
        a.add(arr[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            if(maxFromRight<=arr[i])
            {
                maxFromRight=arr[i];
                a.add(maxFromRight);
            }
        }
        Collections.reverse(a); 
        return a;
    }
}
