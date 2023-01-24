package assigments;

public class arrayLargest {
	
		static int arr[] = {10, 324, 45, 90, 9808,10929821};
		
		// Method to find maximum in arr[]
		static int largest()
		{
			int i;
			
			// Initialize maximum element
			int max = arr[0];
			
			// Traverse array elements from second and
			// compare every element with current max
			for (i = 1; i < arr.length; i++)
				if (arr[i] > max)
					max = arr[i];
			
			return max;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Java Program to find maximum in arr[]
			
				System.out.println("Largest in given array is " + largest());
				
		}

		

	}


