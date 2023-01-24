package assigments;

import java.util.Scanner;

public class numberSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers A and B ");
		Scanner s= new Scanner(System.in);
		//int A = s.nextInt();
		//int B = s.nextInt();
		int A=2;
		int B= 3;
		System.out.print("Numbers befor swaping A & B: "+ A +" "+ B);
		A = A+B;//A*B
		B = A-B;//A/B
		A = A-B;//A/B
		System.out.println("Number after swap:"+A +" "+B);
		
		
	}

}
