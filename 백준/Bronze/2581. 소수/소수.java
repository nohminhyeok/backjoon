import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int sum = 0;
        int min = n;
        int arr[] = new int[n+1];
        
        for(int i=m; i<=n; i++) {
            boolean b = true;
            if(i == 1){
                continue;
            }
            for(int j=2; j<i; j++) {
                if(i%j ==0){
                    b = false;
                    break;
                }
            }
            if(b) {
                sum += i;
                arr[i] = i;
            }
        }
        
        if(sum == 0){
            System.out.println(-1);
        } else {
            for(int i=0; i<n; i++){
                if(min > arr[i] && arr[i] !=0 ){
                    min = arr[i];
                }
            }
            System.out.println(sum);
            System.out.println(min);
        }
    }
}