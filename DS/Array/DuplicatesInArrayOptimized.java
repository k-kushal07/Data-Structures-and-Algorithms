import java.util.*;

public class DuplicatesInArrayOptimized {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the size of array ");
    	int size = sc.nextInt();
    	int arr[] = new int[size];
    	
    	//Enter values less than size
    	System.out.println("Enter the elements ");
    	for(int i=0; i < size; i++)
    	{
            arr[i] = sc.nextInt();
        }
		findRepeating(arr, size);
		
	}
	static void findRepeating(int[] arr, int size) {
			
    	for(int i=0; i < size; i++)
    	{
    		if(arr[Math.abs(arr[i])] > 0)
    			arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
    		else
    			System.out.println(Math.abs(arr[i])+ " is a repeating element.");
    	}
	
	}

}
