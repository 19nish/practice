package assigments;
//How to find all pairs of elements in an array whose sum is equal to given number
// using for loop 
public class pairs_value {
	static  void pairs_value(int inputArray[],int inputNumber) {
		System.out.println("pairs of elements and their sum: ");
		for(int i=0;i < inputArray.length; i++) {
			for(int j = i+1; j < inputArray.length; j++) {
				if(inputArray[i]+inputArray[j] == inputNumber) {
					System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+inputNumber);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 pairs_value(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);
		 pairs_value(new int[] {12, 45, 2, 1, 9, 13, 8, 16},14);
		  pairs_value(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);
		  pairs_value(new int[] {4, 5, 7, 11, 9, 13, 8, 12},20);
	}

}
