package assigments;

import java.util.Scanner;

public class vowelsRemove {
//Write a java program to remove all vowels from a string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1="";
		s1 = s.replaceAll("[aeiouAEIOU]", "");
		System.out.println("String after removing Vowel: "+s1);
	}

}
