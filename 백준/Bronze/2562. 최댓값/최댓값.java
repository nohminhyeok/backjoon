import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] arr = new Integer[9] ;
		Integer max = Integer.MIN_VALUE;
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			 max = Math.max(max, arr[i]);
		}
			System.out.println(max);
			System.out.println(Arrays.asList(arr).indexOf(max)+1);

	}

}
