import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			if(str.substring(0).contains("c=")) {			
				str = str.replaceFirst("c=", ".");
			}  
			else if(str.substring(0).contains("c-")) {		
				str = str.replaceFirst("c-", ".");
			}  
			else if(str.substring(0).contains("dz=")) {
				str = str.replaceFirst("dz=", ".");
			}
			else if(str.substring(0).contains("d-")) {
				str = str.replaceFirst("d-", ".");
			}
			else if(str.substring(0).contains("lj")) {
				str = str.replaceFirst("lj", ".");
			}
			else if(str.substring(0).contains("nj")) {
				str = str.replaceFirst("nj", ".");
			}
			else if(str.substring(0).contains("s=")) {
				str = str.replaceFirst("s=", ".");
			}
			else if(str.substring(0).contains("z=")) {
				str = str.replaceFirst("z=", ".");
			}
		}
			System.out.println(str.length());
		
	}
}