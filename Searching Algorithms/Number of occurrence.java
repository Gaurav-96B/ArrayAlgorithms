import java.io.*;
class Gfg
{
    static int lowerBound(int[] a, int tar) 
    {
    int low = 0;
    int high = a.length - 1;
    int index = -1;
    while (low <= high) 
{
    int mid = (low + high) / 2;
    if (a[mid]==tar) 
{
    index = mid;
    high = mid - 1;
} 
    else if (a[mid] > tar) 
{
    high = mid - 1;
} 
    else 
{
    low = mid + 1;
}
}
    return index;
}
    static int upperBound(int[] a, int tar) {
    int low = 0;
    int high = a.length - 1;
    int index = -1;
    while (low <= high) 
    {
    int mid = (low + high) / 2;
    if (a[mid]==tar) 
{
    index = mid;
    low = mid + 1;
}
    else if (a[mid] > tar) 
{
    high = mid - 1;
} 
    else 
{
    low = mid + 1;
}
}
return index;
}
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) 
{
    int N = sc.nextInt();
    int tar = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < a.length; i++) 
{
    a[i] = sc.nextInt();
}
    int lb = lowerBound(a, tar);
    int ub = upperBound(a, tar);
    if (lb > 0 && ub > 0) 
{
    System.out.println(ub - lb + 1);
} 
    else if (lb == 0 && ub == 0) 
{
    System.out.println(1);
} 
    else 
{
    System.out.println(-1);
    
}
}
}
}
