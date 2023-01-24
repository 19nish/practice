package assigments;
import java.util.Arrays; 
public class arraySecondLarg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {45, 51, 28, 75, 49, 42};
		//invoking sort() method of the Arrays class  
		Arrays.sort(a);
		//to get the second largest number do arrays length - 2 to get second last index value
		int b= a[a.length-2];
		System.out.println("Second Largest Number: "+ b);
		
	}

}
