package assigments;
/*
 * 10th pattern:

    *
   **
  ***
 ****
*****
 */
public class starPattern3 {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=5;i++) {
			for(k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
 

	}	
}
