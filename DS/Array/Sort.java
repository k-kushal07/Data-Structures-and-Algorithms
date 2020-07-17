//Java program to sort an array using in-built Java Functions.

import java.util.*;
public class Sort
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
	    }
	    Arrays.sort(arr);
		  System.out.println(Arrays.toString(arr));
	}
}
