package assigments;

import java.util.Scanner;

public class oddEven {
//Write a java program to find whether a number entered by user is odd and even number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println(num + " is even");
		}else {
			System.out.println(num+ " is odd");
		}

	}

}
