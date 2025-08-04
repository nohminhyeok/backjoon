import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        Arrays.sort(arr);
        
        int maxValid = (arr[0] + arr[1]) - 1;
        int sum = (arr[0] + arr[1]);
        

        if (arr[0] + arr[1] > arr[2]) {
            System.out.println(sum + arr[2]);
        } else {
            System.out.println(sum + maxValid);
        }
    }
}