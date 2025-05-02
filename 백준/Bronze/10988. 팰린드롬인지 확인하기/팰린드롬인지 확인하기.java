import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = S.length() - 1; i >= 0; i--) {
            sb.append(S.charAt(i));
        }

        if (S.equals(sb.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
