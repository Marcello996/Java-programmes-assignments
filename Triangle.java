
public class Triangle {

	public static void printTriangle(int x) {
		int i;
		int j;
		int k;
		for(i=0; i<2*x+1; i++) {
			k=i;
			if(i>x) {
				k=2*x-i;
			}
			for(j=0; j<2*k+1; j++) {
				System.out.print("*");
			}
			if(i!=x) {
			System.out.print("*");
			}
            System.out.println("");
		}
	}

	public static void main(String[] args) {
		printTriangle(10);

	}
}
