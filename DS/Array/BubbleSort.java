import java.util.*;
class BubbleSort
{ 
	static void bubbleSort(int[] arr, int n) 
	{
	    for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                //swapping the elements
                if (arr[j] > arr[j+1]) 
                {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }
	}
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the size of array ");
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    
	    System.out.println("Enter the elements ");
	    for(int i=0; i<n; i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    
	    System.out.print("Initial Array ");
	    for(int i=0; i<n; i++)
	    {
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	    
	    bubbleSort(arr,n);
	    
	    System.out.print("Sorted Array ");
	    for(int i=0; i<n; i++)
	    {
	        System.out.print(arr[i] + " ");
	    }
	    
	}
}
