package assigments;
/*
 * 14th pattern:

	 *
	* *
   * * *
  * * * *
 * * * * *
* * * * * *
 */
public class starPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=6;i++) {
			for(int k= 5;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
				
		}
	}

}
