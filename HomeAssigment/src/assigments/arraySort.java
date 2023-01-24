package assigments;

import java.util.Arrays;

public class arraySort {
	public static int secondLargest(int [] a, int arraySize) {
		Arrays.sort(a);
		return a[arraySize-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,23,43,54,676};
		System.out.println("The second Largest number is:"+ secondLargest(a, 5));
	}

}
