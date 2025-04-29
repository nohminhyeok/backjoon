import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int totalSum = 0 ;
		
		for(int i=0; i<str.length(); i++) {
			int num = 2;
			if(str.substring(i,i+1).equals("A")||str.substring(i,i+1).equals("B")||str.substring(i,i+1).equals("C")) {
				num += 1;
			}else if(str.substring(i,i+1).equals("D")||str.substring(i,i+1).equals("E")||str.substring(i,i+1).equals("F")) {
				num += 2;
			}else if(str.substring(i,i+1).equals("G")||str.substring(i,i+1).equals("H")||str.substring(i,i+1).equals("I")) {
				num += 3;
			}else if(str.substring(i,i+1).equals("J")||str.substring(i,i+1).equals("K")||str.substring(i,i+1).equals("L")) {
				num += 4;
			}else if(str.substring(i,i+1).equals("M")||str.substring(i,i+1).equals("N")||str.substring(i,i+1).equals("O")) {
				num += 5;
			}else if(str.substring(i,i+1).equals("P")||str.substring(i,i+1).equals("Q")||str.substring(i,i+1).equals("R")||str.substring(i,i+1).equals("S")) {
				num += 6;
			}else if(str.substring(i,i+1).equals("T")||str.substring(i,i+1).equals("U")||str.substring(i,i+1).equals("V")) {
				num += 7;
			}else if(str.substring(i,i+1).equals("W")||str.substring(i,i+1).equals("X")||str.substring(i,i+1).equals("Y")||str.substring(i,i+1).equals("Z")) {
				num += 8;
			}
			totalSum += num;
		}
		System.out.println(totalSum);
	}
}