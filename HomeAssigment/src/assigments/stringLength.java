package assigments;

public class stringLength {
//Write a java program to Find length of String without using java inbuilt length method.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sd="Hello Everyone";
		int i=0;
		for(char c: sd.toCharArray()) {
			i++;
		}
		System.out.println("Length of the given string: "+i);
	}

}
