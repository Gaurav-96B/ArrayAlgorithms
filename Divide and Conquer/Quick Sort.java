import java.util.*;
class Sorting
{
static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)

				arr[i] = sc.nextInt();

			
			new QuickSort().quickSort(arr,0,n-1);
			printArray(arr);
		}
} }// } 


class QuickSort
{
    static void quickSort(int arr[], int low, int high)
    {
      if (low < high)
        {
            
            int pi = new QuickSort().partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }  
        
    }
    static int partition(int arr[], int low, int high)
    {
      int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<high;j++)
        {
            if(arr[j]<=pivot)
            {
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=temp;
        return i+1;   
        
    } 
}
