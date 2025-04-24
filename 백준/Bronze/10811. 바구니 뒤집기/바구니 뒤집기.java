import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1; // 1 ~ N 번 까지의 바구니
        }

        
        for (int a = 0; a < M; a++) { // 입력받을 i, j값 / 배열의 위치를 바꾸는 거니까 -1
            int i = sc.nextInt() - 1;  
            int j = sc.nextInt() - 1;

        
            // i의 값이 j보다 작으면 반복 마지막 i++, j__로 서로 값이 같아지면 종료
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // 결과 출력
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}