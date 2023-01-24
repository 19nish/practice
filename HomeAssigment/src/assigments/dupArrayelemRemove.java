package assigments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class dupArrayelemRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3,6,6, 4,7,3,5,3,6,4,4,6,2,6));
			    System.out.println("ArrayList with duplicate elements: " + numbers);

			    // convert the arraylist into a set
			    Set<Integer> set = new LinkedHashSet<>();
			    set.addAll(numbers);

			    // delete all elements of arraylist
			    numbers.clear();

			    // add element from set to arraylist
			    numbers.addAll(set);
			    System.out.println("ArrayList without duplicate elements: " + numbers);
	}

}
