package assigments;


import java.util.Scanner;

public class charCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st;
		int i,len;
		int counter[]=new int[256];
		//Scanner sc= new Scanner(System.in);
		//System.out.print("Enter the string:");
		st= "Java J2EE Java JSP J2EE";
		len = st.length();
		for(i=0;i < len; i++) {
			counter[(int)st.charAt(i)]++;
		}
		for(i=0;i<256;i++) {
			if(counter[i] !=0) {
				System.out.println((char)i+"="+ counter[i]);
			}
		}
	}

}
