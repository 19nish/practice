package assigments;
//Write a java program to find factorial of a given number.
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, fact =1;
		int number = 8;
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
