package assigments;
/*
 *  5th pattern:

1
23
456
78910
 */
public class numberPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4;
		int value=1;
		for(int i =1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		}
	}

}
