import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the size of array ");
    	int size = sc.nextInt();
    	int arr[] = new int[size];
    	    
    	System.out.println("Enter the elements ");
    	for(int i=0; i<size; i++)
    	{
            arr[i] = sc.nextInt();
        }
    	
    	System.out.println("Enter the element to find ");	
    	int s=sc.nextInt();
    			
    	int result = binarySearch(arr, 0, size-1, s);
    	
    	if(result == -1) 
    		System.out.print("Element is not present in the array"); 
    	else
    		System.out.print("Element is present at index: " + result);
	}
	
	public static int binarySearch(int arr[], int lower, int upper, int element) {
		
		if(upper >= lower)
		{
			int mid = (lower + upper-1)/2;
			
			if(arr[mid] > element)
				return binarySearch(arr, lower, mid-1, element);
			else if(arr[mid] ==element)
				return mid;
			else
				return binarySearch(arr, mid+1, upper, element);
		}
		
		else
			return -1;
	}
}
