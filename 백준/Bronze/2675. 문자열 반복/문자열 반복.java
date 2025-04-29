import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 2
		
		for(int i=0; i<T; i++) { // T(2) 만큼 반복
			int R = sc.nextInt(); // 3, 5
			String S = sc.next(); // ABC, /HTP
			String P = "";
			for(int k=0; k<S.length(); k++) { // length = 3, 4
				for(int j=0; j<R; j++) { // R만큼 반복 3번, 5번
					P += S.substring(k, k+1);
				}
			}
			System.out.println(P);	
		}
	}
}