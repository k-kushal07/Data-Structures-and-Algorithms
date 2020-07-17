import java.util.*;

public class LinearSearch
{ 
    public static int linearSearch(int[] arr, int x) 
    { 
    	int n = arr.length; 
    	for(int i = 0; i < n; i++) 
    	{ 
    		if(arr[i] == x) 
    			return i; 
    	} 
    	return -1; 
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
    	
    	System.out.println("Enter the element to find ");	
    	int s=sc.nextInt();
    			
    	int result = linearSearch(arr, s);
    	
    	if(result == -1) 
    		System.out.print("Element is not present in the array"); 
    	else
    		System.out.print("Element is present at index: " + result); 
    } 
} 
