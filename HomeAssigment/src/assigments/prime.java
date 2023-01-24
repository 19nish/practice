package assigments;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, m = 0, flag = 0;
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sd.nextInt();
		m = n / 2;
		
		for (i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println("The number is not prime.");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("The number is prime.");
		}
	}

}
