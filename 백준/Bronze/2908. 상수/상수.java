import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int rA = 0;
		int rB = 0;
		
			int A1 = A/100;
			int A2 = (A%100)/10;
			int A3 = A%10;
			rA += (A3*100 + A2*10 + A1);
			
			int B1 = B/100;
			int B2 = (B%100)/10;
			int B3 = B%10;
			rB += (B3*100 + B2*10 + B1);

			if(rA > rB) {
				System.out.println(rA);
			} else {
				System.out.println(rB);
			}
	}
}