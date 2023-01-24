package assigments;
/*
 * c. 3rd pattern:

1
12
123
1234
12345
 */
public class numberPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,row=5;
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
