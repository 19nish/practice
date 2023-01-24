package assigments;

import java.util.Scanner;

/*
 * 7th pattern:

    1
   121
  12321
 1234321
123454321
 */
public class numberPattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, row;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		row= sc.nextInt();
		for(i=1;i<=row;i++) {
			for(j=1;j<=row-i;j++)
	        {
	            System.out.print(" ");
	        }

	        for(j=1;j<=i;j++)
	        {
	          System.out.print(j);
	        }

	        for(j=i-1;j>=1;j--)
	        {
	            System.out.print(j);
	        }
System.out.println();
		}
	}

}
