package assigments;

public class addingWithoutOperator {
//Write a java program to add two numbers without using arithmatic operator(+,-,*,/,%)
	public static int add(int a, int b) {
		/*
		 * the while loop will run untill b is qual to 0	
		 * [this is when loop will run first  
			 * a= 4 =0100
			 * b= 5 =0101
			 * carry = a&b=	 0100 = 4	
			 * & AND bitwise operator
			 * Bitwise XOR
			 * a=4=0100
			 *b=5=0101
			 *a^b=0001	
			 *b= carry = 4= 0100 << 1=0000 ]
			 * */
		while(b!=0) {
			int carry = a&b;//bitwise AND a&b
			
			a= a^b;// bitwise XOR , ^ XOR bitwise operator
			
			b=carry<<1;// left shift carry by 1 // << left shift
			
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(4, 5));//ans 9
		
	}

}
