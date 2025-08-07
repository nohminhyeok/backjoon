import java.util.Scanner;

public class Main {
    static String[] board;
    static int min = 64;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        board = new String[N];

        for (int i = 0; i < N; i++) {
            board[i] = sc.nextLine();
        }

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                check(i, j);
            }
        }

        System.out.println(min);
    }

    public static void check(int x, int y) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char curr = board[x + i].charAt(y + j);
                if ((i + j) % 2 == 0) {
                    if (curr != 'W') count1++;
                    if (curr != 'B') count2++;
                } else {
                    if (curr != 'B') count1++;
                    if (curr != 'W') count2++;
                }
            }
        }

        min = Math.min(min, Math.min(count1, count2));
    }
}
