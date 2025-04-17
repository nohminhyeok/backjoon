import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
    int totalSum = 0;
	int max = Math.max(a, Math.max(b,c));
		
	        if(a == b && b == c) {
	            totalSum = 10000+(a*1000);
	        } else if(a == b || a == c) {
	            totalSum = 1000+(a*100);
	        } else if(b == c){
	        	totalSum = 1000+(b*100);
	        } else {
	            totalSum = max * 100;
	        }
   	            System.out.println(totalSum);
    }
}