//Java program to find out the largest element in an array

import java.util.*;
public class MaxElement
{
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the size of array ");
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    
	    System.out.println("Enter the elements ");
	    int max=0;
	    for(int i=0; i<n; i++)
	    {
	        arr[i] = sc.nextInt();
	        
	        if(arr[i]>max)
	        {
	            max = arr[i];
	        }
	    }
	    System.out.println("The largest element in given array is: "+max);
	}
}
