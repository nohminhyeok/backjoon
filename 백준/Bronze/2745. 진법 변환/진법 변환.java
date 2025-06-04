import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int B = sc.nextInt();
		
		long result = 0;
		int power = 0;
		int num = 0;
		
		for(int i=s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			if(c>='0' && c<='9') {
				num = c - '0';
			} else { 
				num = c-55;
			}
			result += num * Math.pow(B, power++);
		}
		
		System.out.println(result);


	}
}