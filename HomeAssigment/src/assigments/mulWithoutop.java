package assigments;

import java.util.stream.Stream;

public class mulWithoutop {
	public static int mult(int a, int b) {
		int res = 0;
		while(b!=0) {
			res+=a;
			b--;
		}return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 short sh = (short)'A';
		 int x=12_4;
		System.out.println("Muliplication: "+mult(3,5));
		System.out.println(sh +x);
	}
	
	

}
