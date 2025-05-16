import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		double totalSum = 0;
		
		for(int i=0; i<20; i++) {
			String str = sc.nextLine();
			String[] splitStr = str.split(" ");
			char score = splitStr[2].charAt(0);
			double j;
			
			switch (score) {
			case 'A' : 
				j = 4;
				break;
			case 'B' :
				j = 3;
				break;
			case 'C' :
				j = 2;
				break;
			case 'D' :
				j = 1;
				break;
			case 'F' :
				j = 0;
				break;
			default : continue;
			}
			total += Double.parseDouble(splitStr[1]);
			if(splitStr[2].length() == 2) {
				if(splitStr[2].charAt(1) == '+') {
					j += 0.5;
				}
			}
			totalSum += Double.parseDouble(splitStr[1]) * j;
		}
		System.out.println(totalSum/total);
	}
}