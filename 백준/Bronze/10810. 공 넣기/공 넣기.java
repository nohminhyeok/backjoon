import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for(int m=0; m<M; m++) {
			int i = sc.nextInt(); 
			int j = sc.nextInt(); 
			int k = sc.nextInt();
			
			for(int b=i-1; b<=j-1; b++) {
				arr[b] = k;
			}
		}
		
		for(int n=0; n < N; n++) {
			System.out.print(arr[n] + " ");
		}
	}

}
