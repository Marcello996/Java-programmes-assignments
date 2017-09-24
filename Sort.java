public class Sort {
	public static int[] vector = new int[15];
	public static int[] vectorOrd = new int[15];
	
	public static void createVector() {
		int i;
		
		for(i=0; i<15; i++) {
			vector[i]=(int)(Math.random()*100); 
		}
	}
	
	public static void sortDescending() {
		int i;
		int j;
		int k;
		
		for(i=0; i<15; i++) {
			k=0;
			for(j=0; j<15; j++) {
				if(vector[i]<vector[j]) {
					k++;
				}
			}
			if(vectorOrd[k]==vector[i] && vector[i]!=0) {
				k++;
			}
			vectorOrd[k]=vector[i];
		}
		vector=vectorOrd;
	}
	
	public static void printVector() {
		int i;
		System.out.println("The vector is:");
		for(i=0; i<15; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		createVector();
		printVector();
		sortDescending();
		printVector();
		
	}
}
