package assigments;
/*
 * d. 4th pattern:

1
22
333
4444
55555
 */
public class numberPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int row=5;
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
