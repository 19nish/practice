package assigments;
/**
 * Find pairs with given sum in an array for sorted array
 * @author 003OQT744
 *
 */
public class pairSum_method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sorted array with distinct elements
	       int arr[] = {-5,2,4,5,7, 11, 20};
	       int sum = 15;
	       
	 
	       //Two indexes low and high
	       int low = 0;
	       int high = arr.length - 1;
	 
	       while(low < high) { 
	 
	          /* 
	            if sum of arr[low] + arr[high] is greater than the 
	            value of sum then decrement the value of high. 
	         */ 
	          if((arr[low] + arr[high]) > sum) {
	                high--;
	 
	          } else if ((arr[low] + arr[high]) < sum) {
	                low++;
	 
	          } else if((arr[low] + arr[high]) == sum) {
	                System.out.println(" Pair (" + arr[low] + " , " + arr[high] + " )");
	                low++;
	                high--;
	          }
	       }
	   }

	}


