import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int totalSum = 0;
        for(int i=1; i<=N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            totalSum += a * b;
        }
        if(totalSum == X){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}