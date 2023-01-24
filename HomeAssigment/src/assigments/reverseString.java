package assigments;

import java.util.Scanner;

/**
 * @author 003OQT744
 *
 */
public class reverseString {
public static String reverseString(String str) {
	StringBuilder sb= new StringBuilder(str);
	sb.reverse();
	return sb.toString();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a string:");
			str = sc.nextLine();
		}
		System.out.println(reverseString(str));
	}

}
