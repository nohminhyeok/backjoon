import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int num = sc.nextInt();
        int yak = sc.nextInt();
        int count = 0;
        boolean flag = false;
        
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                count++;
                if(count == yak){
                    flag = true;
                    System.out.println(i);
                }
            }
        }
        if(flag == false){
            System.out.println(0);
        }
    }
}