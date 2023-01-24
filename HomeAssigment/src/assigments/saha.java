package assigments;

public class saha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0, y=6;
		for(; x<y;x++,y--) {
			if(x%2 == 0) {
			continue;
			}
			System.out.println("The Range:" +x+"-"+y);
		}
		int i= 10;
		do {
			System.out.println("The I range:");
			for(int j=i/2;j>0;j--) {
				System.out.println(j+"");
			}
			i -=2;
		}while(i>0);
		
		StringBuilder sb= new StringBuilder(5);
		sb.append("HOWDY");
		sb.insert(0, ' ');
		sb.replace(3,5,"LL");
		sb.insert(6,"COW");
		sb.delete(2, 7);
		System.out.println("Length of string builder:" + sb.length());
	}

}
