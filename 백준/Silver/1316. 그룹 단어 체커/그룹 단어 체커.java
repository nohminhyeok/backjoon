import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		
		for (int i=0; i<N; i++) {
            String str = sc.next();
            boolean[] has = new boolean[26];
            boolean isGroupWord = true;

            for (int j=0; j<str.length(); j++) {
                char current = str.charAt(j);

                if (j>0 && current != str.charAt(j-1)) {
                    if (has[current - 'a']) {
                        isGroupWord = false;
                        break;
                    }
                }
                has[current - 'a'] = true;
            }
            if (isGroupWord) sum++;
        }

        System.out.println(sum);
        sc.close();
    }
}