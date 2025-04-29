import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(arr[0] < 1) {
			arr[0] = 1 - arr[0];
		} else if (arr[0] > 1) {
			arr[0] = (-arr[0]) + 1;
		} else {
			arr[0] = 0;
		}

		if(arr[1] < 1) {
			arr[1] = 1 - arr[1];
		} else if (arr[1] > 1) {
			arr[1] = (-arr[1]) + 1;
		} else {
			arr[1] = 0;
		}
		
		if(arr[2] < 2) {
			arr[2] = 2 - arr[2];
		} else if (arr[2] > 2) {
			arr[2] = (-arr[2]) + 2;
		} else {
			arr[2] = 0;
		}
		
		if(arr[3] < 2) {
			arr[3] = 2 - arr[3];
		} else if (arr[3] > 2) {
			arr[3] = (-arr[3]) + 2;
		} else {
			arr[3] = 0;
		}
		
		if(arr[4] < 2) {
			arr[4] = 2 - arr[4];
		} else if (arr[4] > 2) {
			arr[4] = (-arr[4]) + 2;
		} else {
			arr[4] = 0;
		}
		
		if(arr[5] < 8) {
			arr[5] = 8 - arr[5];
		} else if (arr[5] > 8) {
			arr[5] = (-arr[5]) + 8;
		} else {
			arr[5] = 0;
		}
		
		System.out.print(arr[0]+" ");
		System.out.print(arr[1]+" ");
		System.out.print(arr[2]+" ");
		System.out.print(arr[3]+" ");
		System.out.print(arr[4]+" ");
		System.out.print(arr[5]);
	}
}